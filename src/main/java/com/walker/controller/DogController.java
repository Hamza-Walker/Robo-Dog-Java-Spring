package com.walker.controller;


import com.walker.model.Dog;
import com.walker.service.DogStorage;
import com.walker.service.RandomDogCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogController {
    private final DogStorage dogStorage;

    @Autowired
    public DogController(DogStorage dogStorage) {
        this.dogStorage = dogStorage;
    }

    @GetMapping
    public List<Dog> getAllDogs (){
        return dogStorage.getAllDogsList();
    }
    @GetMapping("/random")
    public Dog getRandomDog() {
        RandomDogCreator randomDog = new RandomDogCreator();
        Dog dog = randomDog.createRandomDog();
        dogStorage.addDog(dog);
        return dog;
    }

    @PostMapping
    public void addDog (@RequestBody Dog dog ){
        dogStorage.addDog(dog);

    }

    @PutMapping("/{name}")
    public void updateDog (
            @PathVariable String name,
            @RequestBody Dog updatedDog
    ){
        dogStorage.updateDog(name, updatedDog.getAge(), updatedDog.getBreed());
    }
}
