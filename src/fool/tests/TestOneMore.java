package fool.tests;

import fool.Methods;
import fool.OneMoreMethod;
import fool.RealObject;

/**
 * Created by Master on 14.08.2016.
 */
public class TestOneMore {

    public static void main(String[] args) {
        OneMoreMethod oMM = new OneMoreMethod();
        Methods methods = new Methods();
        RealObject realObject = new RealObject();


        methods.initMas();
        oMM.moreChange(methods.masik);
        System.out.println(realObject.toStringMas(methods.masik));
    }
}
