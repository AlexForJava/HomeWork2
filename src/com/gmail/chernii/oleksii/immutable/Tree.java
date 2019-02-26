package com.gmail.chernii.oleksii.immutable;

/**
 * Created by Space on 25.02.2019.
 */
public final class Tree {
    private final String name;
    private final double height;
    private final Land land;

    public Tree(String name, double height, Land land) {
        this.name = name;
        this.height = height;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }


    public Land getLand() {
        Land landClone = null;
        try {
            landClone = land.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        if (landClone == null) {
            throw new NullPointerException();
        }
        return landClone;

        //or return new Land(land.getLocation());
    }
}
