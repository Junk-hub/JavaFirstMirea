package ru.mirea.task6.opt1;

public class Planet implements Nameable{
    private String name;
    private float radius;
    private float distance;
    private boolean water;

    public Planet(String name, float radius, float distance, boolean water){
        this.name = name;
        this.radius = radius;
        this.distance = distance;
        this.water = water;
    }

    public String getName() {
        return name;
    }
}
