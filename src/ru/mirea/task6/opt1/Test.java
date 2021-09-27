package ru.mirea.task6.opt1;

public class Test {

    public static void main(String[] args) {
        //Тест варината 1
        Nameable nameable = new Planet("Uranus", 25362, 3, false);
        System.out.println(nameable.getName());
        nameable = new Person("Илья", 19, 178, 'M');
        System.out.println(nameable.getName());
        nameable = new Company("ООО Юрий и товарищи", 890, 167097, false);
        System.out.println(nameable.getName());
        nameable = new Film("Криминальное чтиво", 213928762, "USA");
        System.out.println(nameable.getName());
    }
}
