package ru.mirea.task5.opt1;

public class Cup extends Dish{
    private double volume;
    private boolean thermos;

    public Cup(String color, int size, double volume, boolean thermos){
        super(color, size);
        this.volume = volume;
        this.thermos = thermos;
    }

    public void displayInfo() {
        System.out.println("Цвет: " + super.getColor() + "  диаметр: " + super.getSize() +
                "  объем: " + this.volume + "    термос: " + this.thermos);
    }

    public void changeVolume(double newVolume){
        this.volume = newVolume;
    }
}
