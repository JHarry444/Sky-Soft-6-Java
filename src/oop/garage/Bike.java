package oop.garage;

public class Bike extends Vehicle{

    private boolean sideCar;

    public Bike(int noOfWheels, boolean sideCar) {
        super(noOfWheels);
        this.sideCar = sideCar;
    }

    public Bike() {
    }

    @Override
    public double calcBill() {
        return 5 + (this.sideCar ? 5 : 1);
    }

    public boolean isSideCar() {
        return sideCar;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }
}
