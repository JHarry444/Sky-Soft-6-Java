package oop.generics;

import oop.further.Animal;

public class GenericCage<T extends Animal> {

    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
