package service.tests;

import service.Director;
import service.Money;
import service.Worker;

import java.util.ArrayList;

/**
 * Created by Master on 13.09.2016.
 */
public class TestShowAddDirector {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Director director = new Director();
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<Money> moneys = new ArrayList<>();
        director.addWorker(workers);
        director.addWorker(workers);
        director.addWorker(workers);
        director.showWorker(workers);

        director.fireWorker(workers);
        director.showWorker(workers);

        director.paidSalary(workers);
        System.out.println(workers.get(0).getSalary());



    }

}
