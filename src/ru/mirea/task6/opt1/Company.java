package ru.mirea.task6.opt1;

public class Company implements Nameable{
    private String name;
    private int personal;
    private float income;
    private boolean governmentCompany;

    public Company(String name, int personal, float income, boolean governmentCompany){
        this.name = name;
        this.personal = personal;
        this.income = income;
        this.governmentCompany = governmentCompany;
    }

    public String getName() {
        return name;
    }
}
