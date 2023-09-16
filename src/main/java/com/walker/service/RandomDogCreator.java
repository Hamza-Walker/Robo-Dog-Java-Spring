package com.walker.service;

import com.walker.model.Dog;
import com.walker.model.DogBreed;

import java.util.Random;

public class RandomDogCreator {
    public static final Random random = new Random();

    private static final String[] dogNames = {
            "Buddy", "Max", "Bailey", "Charlie", "Lucy", "Molly", "Sadie", "Coco", "Daisy", "Lola"
            // Add more names as needed
    };


    public Dog createRandomDog (){
        String name = getRandomName();
        int age = random.nextInt(15) + 1;
        DogBreed breed = getRandomDogBreed();
        return new Dog(name, age, breed);
    }

    private static String getRandomName() {
        int randomIndex = random.nextInt(dogNames.length);
        return dogNames[randomIndex];
    }

    private static DogBreed getRandomDogBreed() {
        DogBreed[] breeds = DogBreed.values();
        int randomIndex = random.nextInt(breeds.length);
        return breeds[randomIndex];
    }

}
