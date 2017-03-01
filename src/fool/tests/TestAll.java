package fool.tests;

import fool.Methods;
import fool.RealObject;

/**
 * Created by Master on 04.08.2016.
 */
public class TestAll {

    public static void main(String[] args) {

        RealObject obj = new RealObject();
        Methods met = new Methods();

        met.initMas();
        met.printMas(obj.toStringMas(met.masik));
        met.change(met.masik);
        met.printMas(obj.toStringMas(met.masik));


    }
}
