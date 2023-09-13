package oop.garage;

public class Car extends Vehicle{

    private int bootSize;

    public Car(int noOfWheels, int bootSize) {
        super(noOfWheels);
        this.bootSize = bootSize;
    }

    public Car() {
        super();
    }

    @Override
    public double calcBill() {
        return  10 + 0.5 * this.bootSize;
    }
}
