package ru.mirea.task7.opt5;

public class TestMovablePoint {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(12, -8, 4, 17);
        System.out.println(point.toString());
        point.moveDown();
        point.moveLeft();
        System.out.println(point.toString());
        point.moveUp();
        point.moveRight();
        System.out.println(point.toString());
    }
}
