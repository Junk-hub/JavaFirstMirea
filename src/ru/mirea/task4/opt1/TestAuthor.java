package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String args[]){
        Author author = new Author("Howard Phillips Lovecraft", "hovard-lovecraft@gmail.com", 'M');
        System.out.println(author.toString());
        author.setEmail("none@email.com");
        System.out.println(author.toString());
        System.out.println("name: " + author.getName());
        System.out.println("email: " + author.getEmail());
        System.out.println("gender: " + author.getGender());
    }
}
