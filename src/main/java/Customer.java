import car.Vehicle;

import java.util.ArrayList;

public class Customer {

    double money;
    ArrayList<Vehicle> ownedVehicles;

    public Customer(double money) {
        this.money = money;
        this.ownedVehicles = new ArrayList<Vehicle>();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void buyVehicle(Vehicle car) {
        this.money -= car.getPrice();
        this.ownedVehicles.add(car);
    }
}
