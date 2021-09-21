package ru.mirea.task5.opt1;

public class Fork extends Dish{
    private int numberOfTines;
    private boolean ergonomic;

    public Fork(String color, int size, int numberOfTines, boolean ergonomic){
        super(color, size);
        this.numberOfTines = numberOfTines;
        this.ergonomic = ergonomic;
    }

    public void displayInfo() {
        System.out.println("Цвет: " + super.getColor() + "  диаметр: " + super.getSize() +
                "  кол-во зубцов: " + this.numberOfTines + "    эргономичная: " + this.ergonomic);
    }

    public void brokeTines(int tines){
        this.numberOfTines -= tines;
    }
}
