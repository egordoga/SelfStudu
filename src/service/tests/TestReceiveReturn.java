package service.tests;

import service.Administrator;
import service.Client;
import service.Gadget;
import service.Repairman;

import java.util.ArrayList;

/**
 * Created by Master on 08.09.2016.
 */
public class TestReceiveReturn {

    public static void main(String[] args) {


        Repairman repairman = new Repairman("Petrovich", "444444", 2, 1);
        ArrayList<Gadget> gadgets = new ArrayList<>();
        Administrator administrator = new Administrator("Valia", "666", 1);
        ArrayList<Client> clients = new ArrayList<>();

        administrator.addClient(clients);
        administrator.addClient(clients);
        administrator.showListClient(clients);
        administrator.toRepair(clients, repairman);
        administrator.showListClient(clients);
    }
}
