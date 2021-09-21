package ru.mirea.task5.opt1;

public class CupTest {
    static public void main(String[] args){
        Cup cup = new Cup("Green", 20, 500, false);
        cup.displayInfo();
        cup.changeVolume(600);
        cup.displayInfo();
    }
}
