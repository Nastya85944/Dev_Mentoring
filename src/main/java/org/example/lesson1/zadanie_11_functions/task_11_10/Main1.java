package org.example.lesson1.zadanie_11_functions.task_11_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Burek", 3));
        animals.add(new Cat("Milelon", 4));
        animals.add(new Dog("Puszek", 2));
        animals.add(new Dog("Zorka", 2));
        animals.add(new Cat("Filemon", 1));


        animals.stream()
                .forEach(animal -> {
                    if(animal instanceof Dog){
                        System.out.println(animal.getName() + " is a dog and has " + animal.getNoEyes() + " eyes");
                    } else{
                        System.out.println(animal.getName() + " is a cat and has " + animal.getNoEyes() + " eyes");
                    }
                });

        List<Dog> dogs = animals.stream()
                .filter(animal -> (animal instanceof Dog))
                .map(animal -> (Dog) animal)
                .collect(Collectors.toList());
        System.out.println(dogs.size());


        String dogsName = animals.stream()
                .filter(animal -> animal instanceof Dog)
                .map(animal -> ((Dog)animal).getName())
                .collect(Collectors.joining(" "));
        System.out.println(dogsName);


        String animalsName = animals.stream()
                .map(Animal::getName)
                .collect(Collectors.joining(" "));
        System.out.println(animalsName);

        animals.stream()
                .filter(animal -> animal.getNoEyes() > 2)
                .forEach(animal ->{
                    System.out.println(animal.getName() + " " + animal.getNoEyes());
                });


    }
}
