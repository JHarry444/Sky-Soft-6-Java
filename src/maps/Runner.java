package maps;

import oop.further.Animal;
import oop.further.Cat;
import oop.further.Dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
//      abstraction (interface)   concretion
        Set<String> strings = new HashSet<>();


        strings.add("Hello");
        strings.add("World");
        strings.add("Hello");

        System.out.println(strings);

        Set<Animal> animals = new HashSet<>();

        Dog d = new Dog("Rex", 10, 15, 8, 4);
        animals.add(d);
        animals.add(d);
        System.out.println(d);
        d = new Dog("Rex", 10, 15, 8, 4);
        System.out.println(d);
        animals.add(d);
        animals.add(new Cat());

        System.out.println("Animals: [");
        for (Animal a :
                animals) {
            System.out.println(a);
        }
        System.out.println("]");

        System.out.println("dog == dog: " + (new Dog() == new Dog()));
        System.out.println("dog == dog: " + (new Dog("Rex", 10, 15, 8, 4) == new Dog("Rex", 10, 15, 8, 4)));
        System.out.println("d == d: " + (d == d));

        System.out.println("dog equals dog: " + (new Dog().equals(new Dog())));
        System.out.println("dog equals dog: " + (new Dog("Rex", 10, 15, 8, 4).equals(new Dog("Rex", 10, 15, 8, 4))));
        System.out.println("d equals d: " + (d == d));

        Map<Integer, Animal> animalMap = new HashMap<>();

        animalMap.put(123, new Cat());

        System.out.println(animalMap);

        System.out.println(animalMap.get(123));

        String[] words = "I'm the king of the world".split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
