import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("LegPowered", 69.420, 1000, "Bananas");
    }

    @Test
    public void engineHasName() {
        assertEquals("LegPowered", engine.getName());
    }

    @Test
    public void engineHasPrice() {
        assertEquals(69.420, engine.getPrice(), 0.0);
    }

    @Test
    public void engineHasHorsePower() {
        assertEquals(1000, engine.getHorsePower());
    }

    @Test
    public void engineHasFuelType() {
        assertEquals("Bananas", engine.getFuelType());
    }

    @Test
    public void canGetEngineStatus() {
        assertEquals("The Engine LegPowered has 1000 horsepower and runs on Bananas", engine.getStatus());
    }

}
