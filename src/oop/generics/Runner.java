package oop.generics;

import oop.further.Animal;
import oop.further.Cat;
import oop.further.Dog;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Cage kennel = new Cage();
        Dog dog = new Dog();
        kennel.setAnimal(dog);

        Animal myDog = kennel.getAnimal();

        GenericCage<Dog> newKennel = new GenericCage<>();

        newKennel.setAnimal(new Dog());
        Dog mySecondDog = newKennel.getAnimal();
        mySecondDog.wag();

//        myDog.wag(); compile time error
        // checked at run-time
        if (myDog instanceof Dog) ((Dog) myDog).wag();
        // List OF <Animal>
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        Animal a = animals.get(0);
        // List OF <String>
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");

        String s = strings.get(0);

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(24);

        Integer i = nums.get(0);

    }
}
