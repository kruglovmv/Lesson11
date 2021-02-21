package com.company;

public abstract class Fruit {
    private String name;
    private double wight;

    protected Fruit(String name, double wight) {
        this.name = name;
        this.wight = wight;

    }

    public double getWight() {
    return wight;
    }
}
