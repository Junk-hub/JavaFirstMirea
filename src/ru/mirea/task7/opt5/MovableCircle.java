package ru.mirea.task7.opt5;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius  = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return "R = " + radius + "; center: " + center.toString();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }
}
