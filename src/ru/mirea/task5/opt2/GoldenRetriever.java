package ru.mirea.task5.opt2;

public class GoldenRetriever extends Dog{
    public GoldenRetriever(int year, boolean longWool, String type){
        super(year, longWool, type);
    }

    public void displayInfo(){
        System.out.println("Год вывода породы: " + this.getYear() + "   длинная шерсть: " + this.getLongWool()
        + "    тип собаки: " + this.getType());
    }
}
