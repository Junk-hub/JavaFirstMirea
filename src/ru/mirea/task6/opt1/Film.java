package ru.mirea.task6.opt1;

public class Film implements Nameable{
    private String name;
    private float income;
    private String country;

    public Film(String name, float income, String country){
        this.name = name;
        this.income = income;
        this.country = country;
    }

    public String getName() {
        return name;
    }
}
