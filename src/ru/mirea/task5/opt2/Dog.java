package ru.mirea.task5.opt2;

public abstract class Dog {
    private boolean longWool;
    private int year;
    private String type;

    public Dog(int year, boolean longWool, String type){
        this.year = year;
        this.longWool = longWool;
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public boolean getLongWool() {
        return longWool;
    }

    public abstract void displayInfo();
}
