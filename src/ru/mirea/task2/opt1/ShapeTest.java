package ru.mirea.task2.opt1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Shape(13.0, 24.9, "circle");
        Shape shape2 = new Shape(0.0, 0.0, "square");
        Shape shape3 = new Shape(-190.9, 9.78, "triangle");

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());

        System.out.println(shape1.showCoordinates());
        System.out.println(shape3.getName());
    }
}