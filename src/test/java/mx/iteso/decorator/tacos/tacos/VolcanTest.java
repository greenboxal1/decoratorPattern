package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 03/10/2015.
 */
public class VolcanTest {

    @Test
    public void testCost() {
       Taco taco = new Volcan();
        assertEquals(12.0, taco.cost(),0);
    }

    @Test
    public void testDescription(){
        Taco taco = new Volcan();
        assertEquals("Volcan regular", taco.getDescription());
    }
}
