package ru.mirea.task13.opt2;
import java.util.*;

public class TestLinkedList {

    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();

        //Добавление эл-ов в коллекцию
        cars.add("Ford");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Volvo");
        cars.addLast("Kia");
        cars.addFirst("Tesla");
        cars.add(4, "Lexus");

        //подсчет эл-ов в коллекции
        System.out.println("В списке " + cars.size() + " элементов");

        //Вывод эл-ов коллекции в консоль
        for (String car: cars)
            System.out.println(car);

        //Установка элемента по индексу
        cars.set(0, "Nissan");

        System.out.println();

        //вывод элемента по индексу
        System.out.println(cars.get(0));

        //проверка на наличие объекта в коллекции и вывод его индекса
        if (cars.contains("Ford"))
            System.out.println("Список содержит объект Ford (#" + cars.indexOf("Ford") +")");

        //удаление объектов
        cars.remove("Ford");
        cars.removeFirst();
        cars.removeLast();
    }
}
