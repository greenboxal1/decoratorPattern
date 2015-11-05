package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by Daniel on 01/10/2015.
 */
public class Pescado extends CondimentsDecorator {
    Taco taco;

    public Pescado(Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        if(taco.getSize() == Taco.MINI){
            throw new RuntimeException();
        }
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {

        double sizePrice;

        if(taco.getSize().equals(Taco.MEGA)){
            sizePrice = 4;
        }
        else if(taco.getSize().equals(Taco.REGULAR)){
            sizePrice = 2;
        }else{
            throw new RuntimeException();
        }

        return taco.cost() + sizePrice;
    }
}
