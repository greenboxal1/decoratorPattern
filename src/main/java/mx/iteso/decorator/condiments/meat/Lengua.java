package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Lengua  extends CondimentsDecorator {
    Taco taco;

    public Lengua (Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de lengua";
    }

    @Override
    public double cost() {

        double sizePrice;

        if(taco.getSize() == Taco.MINI){
            sizePrice = 2;
        }
        else if(taco.getSize() == Taco.REGULAR){
            sizePrice = 4;
        }
        else{
            sizePrice = 6;
        }

        return taco.cost() + sizePrice;
    }
}
