package parking.Tests;

import parking.Client;
import parking.ListClient;

/**
 * Created by Master on 18.08.2016.
 */
public class TestListClient {

    public static void main(String[] args) {


        ListClient listClient = new ListClient();
        Client client = new Client();


        //listClient.writeClient();

        System.out.println(client.toString(listClient.writeClient()));

    }
}
