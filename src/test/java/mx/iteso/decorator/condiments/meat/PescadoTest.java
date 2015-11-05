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
public class PescadoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostRegular(){
        Taco pescado = new Pescado(taco);
        when(taco.cost()).thenReturn(10.0);
        when(taco.getSize()).thenReturn("regular");
        double cost = pescado.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco pescado = new Pescado(taco);
        when(taco.cost()).thenReturn(10.0);
        when(taco.getSize()).thenReturn("mega");
        double cost = pescado.cost();
        assertEquals(14.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        when(taco.getSize()).thenReturn("regular");
        String desc = pescado.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }

    @Test (expected = RuntimeException.class)
    public void testExceptionDescription(){
        Taco pescado = new Pescado(taco);
        when(taco.getSize()).thenReturn("mini");
        String desc = pescado.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }

    @Test (expected = RuntimeException.class)
    public void testExceptionCost(){
        Taco pescado = new Pescado(taco);
        when(taco.getSize()).thenReturn("mini");
        assertEquals(10.0, pescado.cost(), 0);
    }
}
