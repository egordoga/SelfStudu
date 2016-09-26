package service.tests;

import service.Administrator;
import service.Client;
import service.Gadget;

import java.util.ArrayList;

/**
 * Created by Master on 27.08.2016.
 */
public class TestAdmin {

    public static void main(String[] args) {
        Administrator administrator = new Administrator("ajhdf","sdljh",5);
        Client client = new Client();

        ArrayList<Client> clients = new ArrayList<Client>();
        ArrayList<Gadget> gadgets = new ArrayList<>();
        administrator.addClient(clients/*, gadgets*/);
        client = clients.get(0);
        System.out.println(client.toString(client));
    }
}
