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
public class ChorizoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostMini(){
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn("mini");
        double cost = chorizo.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCostRegular(){
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn("regular");
        double cost = chorizo.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn("mega");
        double cost = chorizo.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco chorizo = new Chorizo(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = chorizo.getDescription();
        assertEquals("Taco Normal de chorizo", desc);
    }
}
