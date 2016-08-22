package parking.Tests;

import parking.Car;
import parking.Client;
import parking.ListClient;

/**
 * Created by Master on 18.08.2016.
 */
public class TestListClient {

    public static void main(String[] args) {


        ListClient listClient = new ListClient();
        Client client;// = new Client();
        Car car;// = new Car();

        car = listClient.writeCar();
        client = listClient.writeClient(car);

        System.out.println(client.toString(client));

    }
}
