package parking;

import java.util.Scanner;

/**
 * Created by Master on 04.07.2016.
 */
public class ListClient {

    Scanner scanner = new Scanner(System.in);

    Client client = new Client();
    Car car = new Car();
    Client[] listClients = new Client[10];
    int quantity;


    public Client writeClient(){
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Input phone");
        String phone = scanner.next();
        System.out.println("Input car model");
        String model = scanner.next();
        System.out.println("Input car number");
        String number = scanner.next();
        System.out.println("Input car ID");
        int typeId = scanner.nextInt();


        // System.out.println(area.toStreengFree(area.setPlace()));

        System.out.println("Input car numberPlace");
        int numberPlace = scanner.nextInt();

        Car car = new Car(model, number, typeId);
        Client client = new Client(name, phone, car);
        return client;
    }






    public void addClient(Client client){
        listClients[quantity] = client;
        quantity++;


    }
}
