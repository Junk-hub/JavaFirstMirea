package ru.mirea.task3.opt1;

public class CircleTest {
    public static void main(String[] args){
        Circle circle1 = new Circle(0.0, 0.0, 24.8);
        Circle circle2 = new Circle(-18.9, 132.59, 1.0);
        Circle circle3 = new Circle(10.4, 89.3, 76.232);

        System.out.println("Circle 1: Radius " + circle1.getRadius() + " (" + circle1.getCoordinateX() + "; " + circle1.getCoordinateY() + ")");
        System.out.println("Circle 2: Radius " + circle2.getRadius() + " (" + circle2.getCoordinateX() + "; " + circle2.getCoordinateY() + ")");
        System.out.println("Circle 3: Radius " + circle3.getRadius() + " (" + circle3.getCoordinateX() + "; " + circle3.getCoordinateY() + ")");

        circle1.setCoordinateX(-12);
        circle1.setCoordinateY(30.0);
        circle1.setRadius(100.0);
        System.out.println("Circle 1: Radius " + circle1.getRadius() + " (" + circle1.getCoordinateX() + "; " + circle1.getCoordinateY() + ")");
    }
}
