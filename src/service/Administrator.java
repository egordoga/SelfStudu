package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrator extends Worker {

    Client client;
//    ArrayList<Client> clients = new ArrayList<>();
//    ArrayList<Gadget> gadgets = new ArrayList<>();
//    ArrayList<Money> moneys = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    int invoiceNamber = 0;
    //GregorianCalendar date

    public Administrator(){}

    public Administrator(String name, String phone, int profID) {

        super(name, phone, profID);
    }

    //Gadget gadget = new Gadget();

    public void addClient(ArrayList<Client> clients/*, ArrayList<Gadget> gadgets*/) {

        System.out.println("Input name");
        String name = sc.next();
        System.out.println("Input phone");
        String phone = sc.next();
        System.out.println("Input codeID");
        int codeID = sc.nextInt();
        System.out.println("Input gadget nazva");
        String nazva = sc.next();
        System.out.println("Input gadget price");
        int price = sc.nextInt();
        System.out.println("Input date release in format d/M/yy (only XXI century)");
        String day = sc.next();
        /*System.out.println("Input month release");
        int month = sc.nextInt();
        System.out.println("Input yaer release");
        int yaer = sc.nextInt();*/
        System.out.println("Input deadline");
        int deadline = sc.nextInt();
        LocalDate release = LocalDate.parse(day, DateTimeFormatter.ofPattern("d/M/yy"));
                //LocalDate.of(yaer, month, day);
        LocalDate ready = LocalDate.now();
        ready = ready.plusDays(deadline);
        //номер накладной не обнуляется с начала года
        invoiceNamber++;
        //int invoiceNamber = gadgets.getInvoice() + 1;

        Gadget gadget = new Gadget(nazva, price, release, ready, false, false, invoiceNamber);
        //gadgets.add(gadget);
        client = new Client(name, phone, codeID, gadget);
        clients.add(client);
    }

    public void showListClient(ArrayList<Client> clients) {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(client.toString(clients.get(i)));
        }


    }

    public void returnGaget(ArrayList<Client> clients,/* ArrayList<Gadget> gadgets, int code*/ ArrayList<Money> moneys) {
        System.out.println("Input codeID of client");
        int code = sc.nextInt();
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            if (client.getCodeID() == code) {
                /*
                считаем, что мы крутая фирма и нам не нужны сведения о клиентах, поэтому в базе только действующие
                техника отремонтирована при возврате
                клиент платит при получении
                если технике меньше года - гарантия
                 */
                int cost = 0;
                LocalDate date = LocalDate.now();
                if (date.isAfter(client.getGadget().getRelease().plusYears(1))) {
                    cost = client.getGadget().getPrice() / 10;
                }
                //LocalDate date = LocalDate.now();
                Money money = new Money(cost, date);
                moneys.add(money);
                clients.remove(i);
            }
        }
    }

    public void toRepair(ArrayList<Client> clients, Repairman repairman){
        System.out.println("Number of invoice");
        int number = sc.nextInt();
        System.out.println("Who do it?");
        int num = sc.nextInt();
        
        //int index = gadgets.indexOf(number);
       /* пробовал через indexOf - не получилось. Не хотел сразу через цикл, но...*/
        for (int i = 0; i < clients.size() ; i++) {
              if (clients.get(i).getGadget().getInvoice() == number){
                clients.get(i).getGadget().setInRepair(true);
                repairman.setIdRepairman(num);
                break;
            }
        }

    }


}
