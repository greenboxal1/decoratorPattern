package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(String size){
        description = "Quesadilla";
        this.size = size;
    }

    @Override
    public double cost() {

        double sizePrice;

        if(getSize() == Taco.MINI){
            sizePrice = 0;
        }
        else if(getSize() == Taco.REGULAR){
            sizePrice = 1;
        }
        else{
            sizePrice = 2;
        }

        return 10.00 + sizePrice;
    }
}
