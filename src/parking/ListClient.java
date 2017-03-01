package parking;

import java.util.Scanner;

/**
 * Created by Master on 04.07.2016.
 */
public class ListClient {

    Scanner scanner = new Scanner(System.in);

    Client client = new Client();

    Client[] listClients = new Client[10];


    public Client writeClient(Car car){
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Input phone");
        String phone = scanner.next();

        Client client = new Client(name, phone, car);
        return client;
    }


    public Car writeCar(){
        System.out.println("Input car model");
        String model = scanner.next();
        System.out.println("Input car number");
        String number = scanner.next();
        System.out.println("Input car ID");
        int typeId = scanner.nextInt();
        System.out.println("Input car numberPlace");
        int numberPlace = scanner.nextInt();

        Car car = new Car(model, number, typeId, numberPlace);
        return car;
    }



    public void addClient(Client client){
        listClients[client.car.getNumberPlace() - 1] = client;



    }

    public  void printList(Client[] listClients){
        for (int i = 0; i < 10; i++) {
            if(listClients[i] != null){
                System.out.println(client.toString(listClients[i]));
            }
        }
    }
}
