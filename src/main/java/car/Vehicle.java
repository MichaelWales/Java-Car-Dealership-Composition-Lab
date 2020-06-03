package car;

public abstract class Vehicle {

    double price;
    String colour;
    String engine;
    double damage;

    public Vehicle(double price, String colour, String engine) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.damage = 0.00;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getEngine() {
        return engine;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void reducePriceOfVehicle(double damage) {
        this.price -= damage;
        this.damage = damage;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
