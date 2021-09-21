package ru.mirea.task5.opt2;

public class Doberman extends Dog{

    private boolean famousNursery;
    public Doberman(int year, boolean longWool, String type, boolean famousNursery) {
        super(year, longWool, type);
        this.famousNursery = famousNursery;
    }

    public void displayInfo(){
        System.out.println("Год вывода породы: " + this.getYear() + "   длинная шерсть: " + this.getLongWool()
                + "    тип собаки: " + this.getType() + "   известный питомник: " + this.famousNursery);
    }
}
