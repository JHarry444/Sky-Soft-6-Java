package oop.garage;

public abstract class Vehicle {

    private final int id;

    private static int count;
    private int noOfWheels;

    public Vehicle(int noOfWheels) {
        super();
        this.noOfWheels = noOfWheels;
        this.id = ++count;
    }

    public Vehicle() {
        this(0);
    }

    public abstract double calcBill();
    public int getId() {
        return id;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}
