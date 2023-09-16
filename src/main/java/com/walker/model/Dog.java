package com.walker.model;

import java.util.Objects;

public class Dog {

        private String name;
        private int age;
        private DogBreed breed;

    public Dog(String name, int age, DogBreed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DogBreed getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(DogBreed breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }
}
