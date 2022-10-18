import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CarTest {

    Car car;
    Car carNoSeats;
    Engine engine;
    Seats seats;
    Tyres tyres;

    @Before
    public void before() {
        engine = new Engine("LegPowered", 69.420, 1000, "Bananas");
        seats = new Seats("Fancy chairs", 137.00, "Matter", false);
        tyres = new Tyres("Michelin", 420.00, "Great", "Long");

        car = new Car("Pre-historic car", "wheels of Rock and it Rolls", engine, seats, tyres);
        carNoSeats = new Car("Pre-historic car", "wheels of Rock and it doesn't Roll", engine, tyres);

    }

    @Test
    public void carHasName() {
        assertEquals("Pre-historic car", car.getName());
    }

    @Test
    public void carHasManufacturer() {
        assertEquals("wheels of Rock and it Rolls", car.getManufacture());
    }

    @Test
    public void carHasPriceThreeComponents() {
        assertEquals(626.420, car.getPrice(),0.1);
    }

    @Test
    public void carHasPriceTwoComponents() {
        assertEquals(489.42, carNoSeats.getPrice(),0.1);
    }
}
