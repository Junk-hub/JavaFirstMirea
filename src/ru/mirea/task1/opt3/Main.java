package ru.mirea.task1.opt3;
import java.util.Scanner;

public class Main {

    static void task1(){
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Введите очередной элеиент массива с номером: " + i);
            array[i] = in.nextInt();
        }

        System.out.println("Вы ввели массив: ");

        for (int i = 0; i < 10; i++){
            System.out.print(array[i] + "   ");
        }

        int sum = 0;
        System.out.println();

        //Вывод сумма массива при помощи цикла for
        for (int i = 0; i < 10; i++){
            sum += array[i];
        }
        System.out.println("Сумма элементов массива = " + sum);

        //Вывод сумма массива при помощи цикла while
        int i = 0;
        sum = 0;

        while (i < 10){
            sum += array[i];
            i++;
        }
        System.out.println("Сумма элементов массива = " + sum);

        //Вывод сумма массива при помощи цикла do-while
        i = 0;
        sum = 0;

        do {
            sum += array[i];
            i++;
        }while(i < 10);
        System.out.println("Сумма элементов массива = " + sum);
    }

    public static void main(String[] args) {
        task1();
    }
}
