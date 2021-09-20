package ru.mirea.task2.opt3;

public class Book {
    private String language;
    private String name;
    private int pages;
    private int year;

    public Book(String language, int pages, int year, String name) {
        this.language = language;
        this.pages = pages;
        this.year = year;
        this.name = name;
    }

    public Book() {
        this.language = "-";
        this.pages = 0;
        this.year = 0;
        this.name = "No name";
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return ("Name: " + name + "    language: " + language + "    number of pages: " + pages + "    year: " + year);
    }
}
