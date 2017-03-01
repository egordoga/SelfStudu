package service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Director extends Human implements IPaid {

    Scanner sc = new Scanner(System.in);
   // Adress adress = new Adress();
   // Money money = new Money();

    @Override
    public void getPaid(int profID) {

    }

    public void changeAdress (Adress adress){
        System.out.println("Input city");
        String city = sc.next();
        System.out.println("Input street");
        String street = sc.next();
        System.out.println("Input number of house");
        int numberHouse = sc.nextInt();

        adress.setCity(city);
        adress.setStreet(street);
        adress.setNumberHouse(numberHouse);

    }
    
    public void addWorker(ArrayList<Worker> workers){
        System.out.println("Input name");
        String name = sc.next();
        System.out.println("Input phone");
        String phone = sc.next();
        System.out.println("Input profID");
        int profID = sc.nextInt();
        System.out.println("Input salary");
        int salary = sc.nextInt();
        Worker worker = new Worker(name, phone, profID, salary);
        workers.add(worker);
    }

    public void showWorker(ArrayList<Worker> workers){
        for (Worker str: workers) {
            System.out.println(str.toString());
        }
        
    }

    public void fireWorker(ArrayList<Worker> workers){
        System.out.println("Input name lucky person");
        String name = sc.next();
        for (int i = 0; i < workers.size(); i++) {
           if (workers.get(i).getName().equals(name)){
               workers.remove(i);
           }
        }
    }

    public void paidSalary (ArrayList<Worker> workers){
        System.out.println("Input name of loafers");
        String name = sc.next();
        System.out.println("Input salary");
        int newSalary = sc.nextInt();
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getName().equals(name)){
                /*
               * считаем поле зарплата аналогом карточки куда оную перечисляют
               * */
                workers.get(i).setSalary(workers.get(i).getSalary() + newSalary);

            }
        }
    }

   public void paidTax(ArrayList<Money> moneys){
       int incomeMonth = 0;
        System.out.println("Number month");
        int month = sc.nextInt();
        for (int i = 0; i < moneys.size(); i++) {
            LocalDate date = moneys.get(i).getDate();
            if (month == date.getMonthValue()){
                incomeMonth += moneys.get(i).getIncome();
            }
        }

       System.out.println("НДС за " + month + " месяц = " + incomeMonth/6);
    }

    public void muchSalary (ArrayList<Worker> workers){
        System.out.println("Input name of attaboy");
        String name = sc.next();
        System.out.println("Input salary");
        int newSalary = sc.nextInt();
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getName().equals(name)){
                workers.get(i).setSalary(workers.get(i).getSalary() + newSalary + newSalary/10);

            }
        }
    }



}
