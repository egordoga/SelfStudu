package service.tests;

import service.Administrator;
import service.Client;
import service.Director;
import service.Money;

import java.util.ArrayList;

/**
 * Created by Master on 16.09.2016.
 */
public class TestTaxDorector {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Money> moneys = new ArrayList<>();
        Director director = new Director();
        Administrator administrator = new Administrator();

        administrator.addClient(clients);
        administrator.addClient(clients);
        administrator.addClient(clients);
        administrator.showListClient(clients);
        administrator.returnGaget(clients, moneys);
        director.paidTax(moneys);
    }
}
