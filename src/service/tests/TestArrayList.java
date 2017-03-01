package service.tests;

import java.util.ArrayList;

/**
 * Created by Master on 28.08.2016.
 */
public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> clients = new ArrayList<>();
        clients.add("  ddsfklja;lkdf");
        clients.add(" vasia");
        System.out.println(clients.get(1) + clients.get(0));
    }
}
