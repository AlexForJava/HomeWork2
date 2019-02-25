package com.gmail.chernii.oleksii.immutable;

/**
 * Created by Space on 25.02.2019.
 */
public final class Tree {
    private String name;
    private double height;
    private final Land land;

    public Tree(String name, double height, Land land) {
        this.name = name;
        this.height = height;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Land getLand() throws CloneNotSupportedException {
        return land.clone();
    }
}
