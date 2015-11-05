package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Bistec extends CondimentsDecorator {
    Taco taco;

    public Bistec (Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de bistec";
    }

    @Override
    public double cost() {

        double sizePrice;

        if(taco.getSize() == Taco.MINI){
            sizePrice = 0;
        }
        else if(taco.getSize() == Taco.REGULAR){
            sizePrice = 2;
        }
        else{
            sizePrice = 4;
        }

        return taco.cost() + sizePrice;
    }
}
