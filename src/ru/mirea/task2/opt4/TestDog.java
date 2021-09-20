package ru.mirea.task2.opt4;

import java.util.Scanner;

public class TestDog {
    static public void main(String[] args) {
        int n = 3;
        Dog[] dogs = new Dog[n];

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        String name;
        int age;

        for (int i = 0; i < n; i++){
            System.out.println("Введите данные для собаки с номером " + i);

            System.out.print("Имя: ");
            name = scanner.next();

            System.out.print("Возраст: ");
            age = scanner.nextInt();

            dogs[i] = new Dog(name, age);
        }

        for (int i = 0; i < n; i++){
            System.out.println(dogs[i].toString());
            System.out.println(dogs[i].getName() + "is " + dogs[i].getAge() + " YO and in human age: " + dogs[i].toHumanAge());
        }
    }
}
