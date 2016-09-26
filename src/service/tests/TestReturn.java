package service.tests;

import service.Administrator;
import service.Client;
import service.Money;

import java.util.ArrayList;

/**
 * Created by Master on 28.08.2016.
 */
public class TestReturn {

    public static void main(String[] args) {
        Administrator administrator = new Administrator("sdg","sdg",4);
        Money money = new Money();
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Money> moneys = new ArrayList<>();
        administrator.addClient(clients);
        administrator.addClient(clients);
        administrator.addClient(clients);
        administrator.showListClient(clients);
        administrator.returnGaget(clients, moneys);
        administrator.returnGaget(clients, moneys);
        administrator.showListClient(clients);
        money.report(moneys);


    }
}
