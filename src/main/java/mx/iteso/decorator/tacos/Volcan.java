package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by Daniel on 01/10/2015.
 */
public class Volcan extends Taco {

    public Volcan(){
        size = "regular";
        description = "Volcan";
    }

    @Override
    public double cost() {
        return 12.00;
    }
}
