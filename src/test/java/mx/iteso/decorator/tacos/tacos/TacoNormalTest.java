package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {

    @Test
    public void testCostMini() {
        Taco taco = new TacoNormal("mini");
        assertEquals(8.0, taco.cost(),0);
    }

    @Test
    public void testCostRegular() {
        Taco taco = new TacoNormal("regular");
        assertEquals(9.0, taco.cost(),0);
    }

    @Test
    public void testCostMEga() {
        Taco taco = new TacoNormal("mega");
        assertEquals(10.0, taco.cost(),0);
    }

    @Test
    public void testDescription(){
        Taco taco = new TacoNormal("mini");
        assertEquals("Taco normal mini", taco.getDescription());
    }
}
