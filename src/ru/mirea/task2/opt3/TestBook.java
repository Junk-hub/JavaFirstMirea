package ru.mirea.task2.opt3;

public class TestBook {

    public static void main(String args[]){
        Book book1 = new Book();
        Book book2 = new Book("English", 225, 2021, "American Gods");

        System.out.println(book1.toString());

        book1.setName("The Catcher in the Rye");
        book1.setLanguage("Russian");
        book1.setPages(150);
        book1.setYear(2010);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
