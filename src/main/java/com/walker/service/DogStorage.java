package com.walker.service;

import com.walker.model.Dog;
import com.walker.model.DogBreed;

import java.util.ArrayList;
import java.util.List;

public class DogStorage {

    private final List<Dog> allDogsList;

    public DogStorage(List<Dog> dogStorage) {
        this.allDogsList = new ArrayList<>();
    }
    public void addDog (Dog dog){
        allDogsList.add(dog);
    }

    public List<Dog> getAllDogsList() {
        return allDogsList;
    }

    public void updateDog (String name, int newAge , DogBreed updatedBreed){
        for ( Dog dog : allDogsList){
            if ( dog.getName().equals(name)) {
                dog.setAge(newAge);
                dog.setBreed(updatedBreed);
                break;
            }
        }
    }

}
