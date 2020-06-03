package car;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle car;

    @Before
    public void before() {
        car = new Car(12000.00, "Blue", "Diesel");
    }

    @Test
    public void hasPrice() {
        assertEquals(12000.00, car.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals("Diesel", car.getEngine());
    }

    @Test
    public void vehicleStartsWithNoDamage() {
        assertEquals(0.00, car.getDamage(), 0.01);
    }

    @Test
    public void vehicleCanGetDamaged() {
        car.setDamage(100.00);
        assertEquals(100.00, car.getDamage(), 0.01);
    }

    @Test
    public void damageCanReducePriceOfVehicle() {
        car.reducePriceOfVehicle(100.00);
        assertEquals(11900.00, car.getPrice(), 0.01);
        assertEquals(100.00, car.getDamage(), 0.01);
    }

}
