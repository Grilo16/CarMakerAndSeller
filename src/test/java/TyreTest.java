import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TyreTest {
    
    Tyres tyres;
    
    @Before
    public void before() {
        tyres = new Tyres("Michelin", 420.00, "Great", "Long");         
    }

    @Test
    public void tyreHasName() {
        assertEquals("Michelin", tyres.getName());
    }

    @Test
    public void tyreHasPrice() {
        assertEquals(420.00, tyres.getPrice(), 0.0);
    }

    @Test
    public void tyreHasHandling() {
        assertEquals("Great", tyres.getHandling());
    }

    @Test
    public void tyresHasLongevity() {
        assertEquals("Long", tyres.getLongevity());
    }

    @Test
    public void canGetTyreStatus() {
        assertEquals("The tyre Michelin has Great handling and Long longevity.", tyres.getStatus());
    }
}
