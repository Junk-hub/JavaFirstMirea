package ru.mirea.task6.opt1;

public class Person implements Nameable{
    private String name;
    private int age;
    private float height;
    private char gender;

    public Person(String name, int age, float height, char gender){
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
}
