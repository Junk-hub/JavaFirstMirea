package ru.mirea.task2.opt2;

public class Ball {
    private String color;
    private int coast;
    private double size;

    public Ball(String color, int coast, double size){
        this.color = color;
        this.coast = coast;
        this.size = size;
    }

    public Ball(int coast){
        this.coast = coast;
    }

    public Ball(){
        this.color = "None";
        this.coast = 0;
        this.size = 0;
    }

    public int getCoast() {
        return coast;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return ("Color: " + color + "    size: " + size + "    price: " + coast);
    }
}
