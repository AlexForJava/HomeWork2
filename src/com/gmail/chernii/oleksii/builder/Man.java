package com.gmail.chernii.oleksii.builder;

/**
 * Created by Space on 25.02.2019.
 */
public class Man {
    private String name;
    private String surname;
    private int age;
    private double weight;

    private Man() {
    }

    private Man(String name, String surname, int age, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }

    public static Builder newBuilder() {
        return new Man().new Builder();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name.toUpperCase() + " " + surname.toUpperCase() + " " + age + "e.o " + weight + "kg.";
    }

    public class Builder {
        private Builder() {
        }

        public Builder name(String name) {
            Man.this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            Man.this.surname = surname;
            return this;
        }

        public Builder age(int age) {
            Man.this.age = age;
            return this;
        }

        public Builder weight(double weight) {
            Man.this.weight = weight;
            return this;
        }

        public Man build() {
            return Man.this;
        }

    }


    public static BuilderStatic createBuilder() {
        return new BuilderStatic();
    }

    public static class BuilderStatic {
        private String name;
        private String surname;
        private int age;
        private double weight;

        private BuilderStatic() {
        }

        public BuilderStatic name(String name) {
            this.name = name;
            return this;
        }

        public BuilderStatic surname(String surname) {
            this.surname = surname;
            return this;
        }

        public BuilderStatic age(int age) {
            this.age = age;
            return this;
        }

        public BuilderStatic weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Man build() {
            return new Man(name, surname, age, weight);
        }
    }
}
