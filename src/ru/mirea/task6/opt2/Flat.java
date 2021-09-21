package ru.mirea.task6.opt2;

public class Flat implements Priceable{
    private double price;
    private int rooms;

    public Flat(double price, int rooms){
        this.price = price;
        this.rooms = rooms;
    }

    public double getPrice() {
        return price;
    }
}
