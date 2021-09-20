package ru.mirea.task3.opt1;

public class Circle {
    private double radius;
    private double coordinateX;
    private double coordinateY;

    public Circle(double x, double y, double r) {
        this.radius = r;
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public double getCoordinateX() { return coordinateX; }

    public void setCoordinateX(double coordinateX) { this.coordinateX = coordinateX; }

    public double getCoordinateY() { return coordinateY; }

    public void setCoordinateY(double coordinateY) { this.coordinateY = coordinateY; }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }
}
