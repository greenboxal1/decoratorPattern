package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.Queso;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel on 03/10/2015.
 */
public class BistecTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostMini(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(10.0);
        when(taco.getSize()).thenReturn("mini");
        double cost = bistec.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testCostRegular(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(10.0);
        when(taco.getSize()).thenReturn("regular");
        double cost = bistec.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(10.0);
        when(taco.getSize()).thenReturn("mega");
        double cost = bistec.cost();
        assertEquals(14.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de bistec", desc);
    }
}
