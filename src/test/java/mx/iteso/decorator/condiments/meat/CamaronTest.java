package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel on 03/10/2015.
 */
public class CamaronTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostRegular(){
        Taco camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(10.0);
        when(taco.getSize()).thenReturn("regular");
        double cost = camaron.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(10.0);
        when(taco.getSize()).thenReturn("mega");
        double cost = camaron.cost();
        assertEquals(14.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        when(taco.getSize()).thenReturn("mega");
        String desc = camaron.getDescription();
        assertEquals("Taco Normal de camaron", desc);
    }
    @Test (expected = RuntimeException.class)
    public void testCostException(){
        Taco camaron = new Camaron(taco);
        when(taco.getSize()).thenReturn("mini");
        assertEquals(15.0, camaron.cost(), 0);
    }

    @Test (expected = RuntimeException.class)
    public void testDescriptionException(){
        Taco camaron = new Camaron(taco);
        when(taco.getSize()).thenReturn("mini");
        assertEquals("Taco", camaron.getDescription());
    }
}
