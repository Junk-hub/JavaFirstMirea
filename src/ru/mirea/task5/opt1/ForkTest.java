package ru.mirea.task5.opt1;

public class ForkTest {
    static public void main(String[] args){
        Fork fork = new Fork("black", 12, 5, true);
        fork.displayInfo();
        fork.brokeTines(2);
        fork.displayInfo();
    }
}
