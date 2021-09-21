package ru.mirea.task5.opt1;

public abstract class Dish{
    private String color;
    private int size;

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Dish(String color, int size){
        this.color = color;
        this.size = size;
    }

    public abstract void displayInfo();
}
