package com.gmail.chernii.oleksii.inner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Space on 25.02.2019.
 */
public class Car {
    private String name;
    private Engine engine;
    private Wheel wheel = new Wheel() {
        @Override
        public void pumpUp() {
            System.out.println("pumping");
        }

        @Override
        public void pumpDowm() {
            System.out.println("wheel is flat");
        }
    };

    public Car() {
    }

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }


    public class Engine {
        private String carName;
        private double power;

        public Engine(String carName, double power) {
            this.power = power;
        }

        public double getPower() {
            return power;
        }

        public String getCarName() {
            return carName;
        }
    }

    public static class Cities {
        private List<String> list;

        public Cities(String city) {
            list = new ArrayList<String>();
            list.add(city);
        }

        public void add(String city) {
            list.add(city);
        }

        public String getCities() {
            StringBuilder stringBuilder = new StringBuilder();
            for (String c : list)
                stringBuilder.append(c + " ");
            return stringBuilder.toString();
        }
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void ride() {
        System.out.println("The car is moving");
        final int count = 10;
        class Beep {
            void beep() {
                for (int i = 0; i < count; i++)
                    System.out.print("beep ");
                System.out.println();
            }
        }

        Beep beep = new Beep();
        beep.beep();
    }
}
