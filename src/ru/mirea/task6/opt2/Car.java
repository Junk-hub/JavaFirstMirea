package ru.mirea.task6.opt2;

public class Car implements Priceable{
    private double price;
    private String model;
    private int numberOfDoors;

    public Car(double price, String model, int numberOfDoors){
        this.price = price;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public double getPrice() {
        return price;
    }
}
