package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Chorizo extends CondimentsDecorator {
    Taco taco;

    public Chorizo(Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de chorizo";
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
