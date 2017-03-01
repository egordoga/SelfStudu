package parking.Tests;

import parking.ListClient;

/**
 * Created by Master on 20.08.2016.
 */
public class TestAddClient {

    public static void main(String[] args) {

        ListClient listClient = new ListClient();

        //listClient.writeCar();
        listClient.addClient(listClient.writeClient(listClient.writeCar()));


      // listClient.printList();
    }


}
