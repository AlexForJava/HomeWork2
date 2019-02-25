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

        public Builder setName(String name) {
            Man.this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            Man.this.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            Man.this.age = age;
            return this;
        }

        public Builder setWeight(double weight) {
            Man.this.weight = weight;
            return this;
        }

        public Man build() {
            return Man.this;
        }

    }
}
