package ru.mirea.task6.opt2;

public class Test {

    public static void main(String[] args) {
        //Тест варианта 2
        Priceable priceable = new Car(50000.0, "Porsche - 911", 3);
        System.out.println(priceable.getPrice());
        priceable = new Flat(67000.0, 3);
        System.out.println(priceable.getPrice());
        priceable = new Coffee(15.0, "Arabic");
        System.out.println(priceable.getPrice());
    }
}
