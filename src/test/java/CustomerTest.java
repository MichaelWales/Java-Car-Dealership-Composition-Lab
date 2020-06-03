import car.Car;
import car.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer(20000.00);
    }

    @Test
    public void startsWithMoney() {
        assertEquals(20000.00, customer.getMoney(), 0.01);
    }

    @Test
    public void canSetMoney() {
        customer.setMoney(500.00);
        assertEquals(500.00, customer.getMoney(), 0.01);
    }

    @Test
    public void canReduceMoney() {
        Vehicle car = new Car(10000.00, "Red", "Petrol");
        customer.buyVehicle(car);
        assertEquals(10000.00, customer.getMoney(), 0.01);
    }

    @Test
    public void newCarIsInOwnedVehicles() {
        Vehicle car = new Car(10000.00, "Red", "Petrol");
        customer.buyVehicle(car);
        assertEquals(1, customer.ownedVehicles.size());
    }

}
