package oop.further;

import java.util.Objects;

public abstract class Animal extends Object implements Billable{

    private String name;
    private int age;
    private float height;
    private float weight;

    private int noOfLegs;

    public Animal() {
        super();
    }

    public Animal(String name, int age, float height, float weight, int noOfLegs) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.noOfLegs = noOfLegs;
    }

    public abstract void speak();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (Float.compare(animal.height, height) != 0) return false;
        if (Float.compare(animal.weight, weight) != 0) return false;
        if (noOfLegs != animal.noOfLegs) return false;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + noOfLegs;
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", noOfLegs=" + noOfLegs +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
