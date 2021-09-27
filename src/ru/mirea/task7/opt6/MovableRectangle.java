package ru.mirea.task7.opt6;
import ru.mirea.task7.opt5.MovablePoint;

public class MovableRectangle extends MovablePoint {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        super(x1, y1, xSpeed, ySpeed);
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString(){
        return "Top left: " + this.topLeft.toString() + " Bottom right: " + this.bottomRight.toString();
    }

    @Override
    public void moveUp() {
        super.moveUp();
        bottomRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
        bottomRight.moveDown();
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
        bottomRight.moveRight();
        topLeft.moveRight();
    }
}
