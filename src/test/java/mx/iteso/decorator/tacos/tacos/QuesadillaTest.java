package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.Volcan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 03/10/2015.
 */
public class QuesadillaTest {

    @Test
    public void testCostMini() {
        Taco taco = new Quesadilla("mini");
        assertEquals(10.0, taco.cost(),0);
    }

    @Test
    public void testCostRegular() {
        Taco taco = new Quesadilla("regular");
        assertEquals(11.0, taco.cost(),0);
    }

    @Test
    public void testCostMega() {
        Taco taco = new Quesadilla("mega");
        assertEquals(12.0, taco.cost(),0);
    }

    @Test
    public void testDescription(){
        Taco taco = new Quesadilla("mega");
        assertEquals("Quesadilla mega", taco.getDescription());
    }
}
