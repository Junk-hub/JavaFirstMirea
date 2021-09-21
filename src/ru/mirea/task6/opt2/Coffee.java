package ru.mirea.task6.opt2;

public class Coffee implements Priceable{
    double price;
    String sort;

    public Coffee(double price, String sort){
        this.price = price;
        this.sort = sort;
    }

    public double getPrice() {
        return price;
    }
}
