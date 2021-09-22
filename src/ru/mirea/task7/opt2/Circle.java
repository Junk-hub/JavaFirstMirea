package ru.mirea.task7.opt2;

public class Circle extends Shape{
    protected double radius;

    public Circle(){};

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * radius * 3.1416);
    }

    @Override
    public double getPerimeter() {
        return (2 * 3.1416 * radius);
    }

    @Override
    public String toString(){
        return "Цвет: " + color + "    заполненность: " + filled + "    радиус: " + radius;
    }
}
