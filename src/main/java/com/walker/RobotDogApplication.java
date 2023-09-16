package com.walker;

import com.walker.model.Dog;
import com.walker.service.RandomDogCreator;

public class RobotDogApplication {

    public static void main (String [] args){
        RandomDogCreator creator = new RandomDogCreator();
        Dog dog  = creator.createRandomDog();
        System.out.println(dog);
    }
}
