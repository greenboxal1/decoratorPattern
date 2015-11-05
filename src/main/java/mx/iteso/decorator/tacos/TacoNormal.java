package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(String size){
        this.size = size;
        description = "Taco normal";
    }

    @Override
    public double cost() {
        double sizePrice = 0;
        if(getSize() == Taco.MINI){
            sizePrice = 0;
        }
        else if(getSize() == Taco.REGULAR){
            sizePrice = 1;
        }
        else {
            sizePrice = 2;
        }
        return 8.00 + sizePrice;
    }
}
