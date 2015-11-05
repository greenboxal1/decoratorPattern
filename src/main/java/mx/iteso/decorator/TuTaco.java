package mx.iteso.decorator;

import mx.iteso.decorator.condiments.Cebolla;
import mx.iteso.decorator.condiments.Cilantro;
import mx.iteso.decorator.condiments.TortillaHarina;
import mx.iteso.decorator.condiments.TortillaMaiz;
import mx.iteso.decorator.condiments.meat.*;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;

public class TuTaco {
    public static void main(String[] args) {
        Taco taco = new Quesadilla(Taco.MINI);
        taco = new TortillaHarina(taco);
        taco = new Pastor(taco);
        taco = new Cebolla(taco);

        System.out.println();
        System.out.println();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        Taco taco2 = new TacoNormal(Taco.MINI);
        taco2 = new Bistec(taco2);
        taco2 = new Camaron(taco2);
        System.out.println();
        System.out.println();
        System.out.println(taco2.getDescription());
        System.out.println("$" + taco2.cost() + " MXN");

        Taco taco3 = new TacoNormal(Taco.REGULAR);
        taco3 = new Bistec(taco3);
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");

        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");

        taco3 = new TortillaMaiz(taco3);
        taco3 = new Chorizo(taco3);
        taco3 = new Cebolla(taco3);
        taco3 = new Cilantro(taco3);

        System.out.println();
        System.out.println();
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");

        Taco taco4 = new TacoNormal(Taco.MEGA);

        taco4 = new TortillaHarina(taco4);
        taco4 = new Lengua(taco4);
        taco4 = new Cilantro(taco4);

        System.out.println();
        System.out.println();
        System.out.println(taco4.getDescription());
        System.out.println("$" + taco4.cost() + " MXN");

    }
}
