package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel on 03/10/2015.
 */
public class TortillaDeHarinaTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco tortillaDeHarina = new TortillaHarina(taco);
        when(taco.cost()).thenReturn(9.0);
        double cost = tortillaDeHarina.cost();
        assertEquals(13.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco tortillaDeHarina = new TortillaHarina(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = tortillaDeHarina.getDescription();
        assertEquals("Taco Normal en tortilla de harina", desc);
    }
}
