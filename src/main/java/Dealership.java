import car.Vehicle;

import java.util.ArrayList;

public class Dealership {

    double till;
    ArrayList<Vehicle> stock;

    public Dealership() {
        this.till = 0.00;
        this.stock = new ArrayList<Vehicle>() ;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Vehicle> getStock() {
        return this.stock;
    }

    public void buyVehicle(Vehicle car) {
        this.till -= car.getPrice();
        this.stock.add(car);
    }

    public void sellVehicle(Vehicle car, Customer customer) {
        this.till += car.getPrice();
        this.stock.remove(car);
        customer.buyVehicle(car);
    }

    public void repairVehicle(Vehicle car) {
        this.till -= car.getDamage();
        car.setPrice(car.getPrice() + car.getDamage());
        car.setDamage(0.00);
    }
}
