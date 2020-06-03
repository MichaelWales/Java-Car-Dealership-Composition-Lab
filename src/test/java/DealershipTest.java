import car.Car;
import car.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void before() {
        dealership = new Dealership();
    }

    @Test
    public void tillStartsEmpty() {
        assertEquals(0.00, dealership.getTill(), 0.01);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, dealership.getStock().size());
    }

    @Test
    public void canSetTill() {
        dealership.setTill(100.00);
        assertEquals(100.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canReduceTill() {
        Vehicle car = new Car(10000.00, "Red", "Petrol");
        dealership.setTill(15000.00);
        dealership.buyVehicle(car);
        assertEquals(5000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void newCarIsInOwnedVehicles() {
        Vehicle car = new Car(10000.00, "Red", "Petrol");
        dealership.buyVehicle(car);
        assertEquals(1, dealership.getStock().size());
    }

    @Test
    public void canSellVehicle() {
        Vehicle car = new Car(10000.00, "Red", "Petrol");
        Customer customer = new Customer(12000.00);
        dealership.sellVehicle(car, customer);
        assertEquals(10000.00, dealership.getTill(), 0.01);
        assertEquals(0, dealership.getStock().size());
        assertEquals(2000.00, customer.getMoney(), 0.01);
        assertEquals(1, customer.getOwnedVehicles().size());
    }

    @Test
    public void canRepairVehicle() {
        Vehicle car = new Car(9000.00, "Red", "Petrol");
        car.setDamage(1000.00);
        dealership.setTill(1000.00);
        dealership.repairVehicle(car);
        assertEquals(0.00, dealership.getTill(), 0.01);
        assertEquals(0.00, car.getDamage(), 0.01);
        assertEquals(10000.00, car.getPrice(), 0.01);
    }

}
