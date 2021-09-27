package ru.mirea.task7.opt6;

public class TestMovableRectangle {
    public static void main(String[] args){
        MovableRectangle rectangle = new MovableRectangle(7, 7, 90, -12, 360, -600);
        System.out.println(rectangle.toString());
        rectangle.moveRight();
        rectangle.moveUp();
        System.out.println(rectangle.toString());
        rectangle.moveLeft();
        rectangle.moveDown();
        System.out.println(rectangle.toString());
    }
}
