package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
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
