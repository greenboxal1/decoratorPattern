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
public class QuesoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostMini(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(9.0);
        when(taco.getSize()).thenReturn("mini");
        double cost = queso.cost();
        assertEquals(11.0, cost,0);
    }

    @Test
    public void testCostRegular(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(9.0);
        when(taco.getSize()).thenReturn("regular");
        double cost = queso.cost();
        assertEquals(13.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(9.0);
        when(taco.getSize()).thenReturn("mega");
        double cost = queso.cost();
        assertEquals(15.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = queso.getDescription();
        assertEquals("Taco Normal con queso", desc);
    }
}
