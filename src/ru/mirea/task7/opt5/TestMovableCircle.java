package ru.mirea.task7.opt5;

public class TestMovableCircle {
    public static void main(String[] args){
        MovableCircle circle = new MovableCircle(7, -90, 13, 56, 60);
        System.out.println(circle.toString());
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle.toString());
        circle.moveRight();
        circle.moveUp();
        System.out.println(circle.toString());
    }
}
