package parking;

import java.util.Scanner;

/**
 * Created by Master on 06.07.2016.
 */
public class MainMenu {

    private Scanner scanner = new Scanner(System.in);


    private Car car = new Car();
    Area area = new Area();
    // Area[] place = new Area[10];
    private Client client;


    public void start(Area[] place) {
        //Client client = new Client();
        ListClient listClient = new ListClient();
        //ListClient[] listClients = new ListClient[10];


        while (true) {

            System.out.println("1. Проверить свободные места");
            System.out.println("2. Парковать ТС");
            System.out.println("3. Освободить место");
            System.out.println("4. Вывести список клиентов");
            System.out.println("5. Показать клиента по номеру места");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println(car.toStreengFree(listClient.listClients));
            } else if (choice == 2) {
                this.client = listClient.writeClient(listClient.writeCar());
                listClient.addClient(client);
                //car.park(place, client);
            } else if (choice == 3) {
                car.unPark(listClient.listClients);
            } else if (choice == 4) {
                listClient.printList(listClient.listClients);
            } else if (choice == 5){
                System.out.println("Введите номер места");
                int mesto = scanner.nextInt();
                System.out.println(client.toString(listClient.listClients[mesto-1]));
            } else break;


        }
    }




}
