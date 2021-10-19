package ru.mirea.task13.opt1;
import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        //Добавление эл-ов в коллекцию
        cars.add("Ford");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Kia");
        cars.add("Tesla");

        //Вывод эл-ов коллекции в консоль
        for (String state: cars)
            System.out.println(state);

        System.out.println("");

        //Установка эл-та по индексу
        cars.set(1, "Mazda");
        System.out.println(cars.get(1));

        //подсчет эл-ов в коллекции
        System.out.println("В списке " + cars.size() + " элементов");

        //проверка на наличие объекта в коллекции и вывод его индекса
        if (cars.contains("Mazda"))
            System.out.println("Список содержит объект Mazda (#" + cars.indexOf("Mazda") +")");

        //удаление объектов
        cars.remove(4);
        cars.remove("BMW");

        System.out.println("");

        //Сортировка эл-ов
        Collections.sort(cars);
        Collections.reverse(cars);

        //Вывод эл-ов коллекции в консоль
        for (String state: cars)
            System.out.println(state);

        System.out.println("");

        //перевод коллекции в массив
        Object[] car = cars.toArray();
        for (Object c: car)
            System.out.println(c);
    }
}
