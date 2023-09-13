package oop.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles = new ArrayList<>();

    public boolean addVehicle(Vehicle v) {
        return this.vehicles.add(v);
    }

    public boolean remove(int id) {
        for (Vehicle v : this.vehicles) {
            if (v.getId() == id) {
                return this.vehicles.remove(v);
            }
        }
        return false;
    }

    public boolean remove(String type) {
        List<Vehicle> toRemove = new ArrayList<>();

        for (Vehicle v: this.vehicles) {
            if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
                toRemove.add(v);
            }
        }
        return this.vehicles.removeAll(toRemove);
    }

    public boolean remove(Class<Vehicle> clazz) {
        List<Vehicle> toRemove = new ArrayList<>();

        for (Vehicle v: this.vehicles) {
            if (v.getClass() == clazz) {
                toRemove.add(v);
            }
        }
        return this.vehicles.removeAll(toRemove);
    }

    public boolean empty() {
        this.vehicles.clear();
        return this.vehicles.size() == 0;
    }
}
