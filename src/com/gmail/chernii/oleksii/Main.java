package com.gmail.chernii.oleksii;

import com.gmail.chernii.oleksii.builder.Man;
import com.gmail.chernii.oleksii.immutable.Land;
import com.gmail.chernii.oleksii.immutable.Tree;
import com.gmail.chernii.oleksii.innerclasses.Car;

/**
 * Created by Space on 25.02.2019.
 */
public class Main {
    public static void main(String[] args) {
        Man man = Man.newBuilder().setName("Alex").setSurname("Soul").setWeight(50.0).setAge(40).build();
        System.out.println(man);

        Car.Engine engine = new Car().new Engine("BMW", 190.);
        Car bmw = new Car(engine.getCarName(), engine);
        bmw.ride();

        Car.Cities cities = new Car.Cities("London");
        cities.add("Paris");
        cities.add("New York");
        System.out.println(cities.getCities());

        Land land = new Land("Forrest");
        Tree tree = new Tree("Pine", 19.0,  land);

        try {
            System.out.println(land == tree.getLand());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
