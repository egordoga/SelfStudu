package service.tests;

import service.Adress;
import service.Director;

/**
 * Created by Master on 13.09.2016.
 */
public class TestDirector {

    public static void main(String[] args) {

        Director director = new Director();
        Adress adress = new Adress();
        director.changeAdress(adress);
        System.out.println(adress.toString());
    }
}
