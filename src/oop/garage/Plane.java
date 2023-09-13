package oop.garage;

public class Plane extends Vehicle{

    private boolean propeller;

    public Plane(int noOfWheels, boolean propeller) {
        super(noOfWheels);
        this.propeller = propeller;
    }

    @Override
    public double calcBill() {
        return 100 * (this.propeller ? 0.5 : 1);
    }

    public Plane() {
    }

    public boolean isPropeller() {
        return propeller;
    }

    public void setPropeller(boolean propeller) {
        this.propeller = propeller;
    }
}
