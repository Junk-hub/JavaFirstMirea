package ru.mirea.task1.opt7;
import java.util.Scanner;

public class Opt7 {

    static void task5(){

        int n = -9;
        Scanner in = new Scanner(System.in);

        while (n < 0){
            System.out.println("Введите число, для которого необходимо вычислить факториал: ");
            n = in.nextInt();
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.println(n +"! = " + result);
    }


    public static void main(String[] args) {
        task5();
    }
}
