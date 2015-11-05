package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel on 03/10/2015.
 */
public class PastorTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostMini(){
        Taco pastor = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn("mini");
        double cost = pastor.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCosRegulart(){
        Taco pastor = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn("regular");
        double cost = pastor.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco pastor = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn("mega");
        double cost = pastor.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pastor.getDescription();
        assertEquals("Taco Normal de pastor", desc);
    }
}
