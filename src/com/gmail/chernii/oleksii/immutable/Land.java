package com.gmail.chernii.oleksii.immutable;

/**
 * Created by Space on 25.02.2019.
 */
public class Land implements Cloneable {
    private String location;

    public Land(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public Land clone() throws CloneNotSupportedException {
        return (Land) super.clone();
    }
}
