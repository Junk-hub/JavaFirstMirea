package ru.mirea.task2.opt2;

public class BallTest {

    public static void main(String[] args) {
        Ball ball1 = new Ball("Red", 150, 50.0);
        Ball ball2 = new Ball();
        Ball ball3 = new Ball(60);

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
        System.out.println("price: " + ball1.getCoast());

        ball3.setColor("Blue");
        System.out.println(ball3.toString());
    }
}
