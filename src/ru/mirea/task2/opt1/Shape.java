package ru.mirea.task2.opt1;

public class Shape {
    private double coordinateX;
    private double coordinateY;
    private String name;

    public Shape(double x, double y, String name){
        this.coordinateX = x;
        this.coordinateY = y;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String showCoordinates(){
        return("X: " + coordinateX + " Y:" + coordinateY);
    }

    public  String toString(){
        return("Shape: " + name + "; coordinates: (" + coordinateX + "; " + coordinateY + ")");
    }
}
