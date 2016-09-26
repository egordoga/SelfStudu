package service.tests;

import service.Administrator;
import service.Client;
import service.Gadget;

import java.util.ArrayList;

/**
 * Created by Master on 28.08.2016.
 */
public class TestShowList {

    public static void main(String[] args) {
        Administrator administrator = new Administrator("sdg","sdg",4);
        ArrayList <Client> clients = new ArrayList<>();
        ArrayList<Gadget> gadgets = new ArrayList<>();
        administrator.addClient(clients/*, gadgets*/);
        administrator.addClient(clients/*, gadgets*/);
        administrator.addClient(clients/*, gadgets*/);
        administrator.showListClient(clients);
    }
}
