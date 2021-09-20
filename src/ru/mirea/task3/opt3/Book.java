package ru.mirea.task3.opt3;

public class Book {
    private String language;
    private String name;
    private int pages;
    private int year;
    private String author;

    public Book(String language, int pages, int year, String name, String author) {
        this.language = language;
        this.pages = pages;
        this.year = year;
        this.name = name;
        this.author = author;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getPages() { return pages; }

    public void setPages(int pages) { this.pages = pages; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    public String toString() {
        return ("Name: " + name + "    language: " + language + "    number of pages: " +
                pages + "    year: " + year + "     author: " + author);
    }
}
