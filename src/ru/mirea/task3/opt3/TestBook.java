package ru.mirea.task3.opt3;

public class TestBook {

    public static void main(String args[]){
        Book book1 = new Book("English", 256, 2001, "American Gods", "Neil Gaiman");

        System.out.println(book1.toString());

        book1.setLanguage("Russian");
        book1.setPages(300);
        book1.setYear(2005);
        book1.setName("Американские боги");
        book1.setAuthor("Нил Гейман");

        System.out.println("автор - " + book1.getAuthor());
        System.out.println("книга - " + book1.getName());
        System.out.println("кол-во страниц - " + book1.getPages());
        System.out.println("год выпуска - " + book1.getYear());
        System.out.println("язык - " +book1.getLanguage());
    }
}
