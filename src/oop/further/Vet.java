package oop.further;

import java.util.ArrayList;
import java.util.List;

public class Vet {


    private List<Animal> animals = new ArrayList<>();


//    without subtyping you'd have to write an add____ method for every animal
//    public boolean addDog(Dog d) {
//        return this.animals.add(d);
//    }

    public boolean addAnimal(Animal a) {
        return this.animals.add(a);
    }

    public boolean removeAnimal(Animal a) {
        return this.animals.remove(a);
    }

    public void poke() {
        for (Animal a: this.animals) {
            a.speak();
        }
    }

    @Override
    public String toString() {
        return "Vet{" +
                "animals=" + animals +
                '}';
    }
}
