package ru.mirea.task7.opt2;

public class Square extends Rectangle{
    public Square(){};

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        super.setWidth(side);
    }

    public String toString(){
        return "Цвет: " + color + "    заполненность: " + filled + "    сторона: " + width;
    }
}
