import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatsTest {

    Seats seats;

    @Before
    public void before() {
        seats = new Seats("Fancy chairs", 137.00, "Matter", false);
    }

    @Test
    public void seatsHaveName() {
        assertEquals("Fancy chairs", seats.getName());
    }

    @Test
    public void seatsHavePrice() {
        assertEquals(137.00, seats.getPrice(),0.0);
    }

    @Test
    public void seatsHaveMaterials() {
        assertEquals("Matter", seats.getMaterials());
    }

    @Test
    public void seatsHaveHeatingStatus() {
        assertEquals(false, seats.getHeated());
    }

    @Test
    public void canGetSeatsStatus() {
        assertEquals("The seats Fancy chairs are made of Matter and it wont warm up your bum", seats.getStatus());
    }
}
