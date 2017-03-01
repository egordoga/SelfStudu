package service;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    Scanner sc = new Scanner(System.in);
    ArrayList <Worker> workers = new ArrayList<>();
    ArrayList <Money> moneys = new ArrayList<>();
    Money money = new Money();
    ArrayList<Client> clients = new ArrayList<>();
    Repairman repairman = new Repairman();




        void menuMain() {
            int i = -1;
            while (!(i == 0)) {
                System.out.println("Ты кто?" +
                        "\n1. Директор" +
                        "\n2. Администратор" +
                        "\n3. Ремонтник" +
                        "\n0. Выход");
                int vybor = sc.nextInt();
                switch (vybor) {
                    case 1:
                        menuDirehtor();
                        break;
                    case 2:
                        menuAdmin();
                        break;
                    case 3:
                        menuRipairman();
                        break;
                    case 0: i = 0;
                        break;
                    default:
                        System.out.println("На работе пить низя");
                }
            }
        }

     void menuDirehtor(){
        Director director = new Director();
        int i = -1;
        while (!(i ==0)){
            System.out.println("1. Скрываемся от кредщиторов" +
                            "\n2. Нанять сотрудника" +
                            "\n3. Уволить сотрудника" +
                            "\n4. Список сотрудников" +
                            "\n5. Посмотреть доход" +
                            "\n6. Заплатить зарплату" +
                            "\n7. Увеличить зарплату" +
                            "\n8. Заплатить налог" +
                            "\n0. Выход");

            int vybor = sc.nextInt();
            switch (vybor){
                case 1: director.changeAdress(new Adress());
                    break;
                case 2: director.addWorker(workers);
                    break;
                case 3: director.fireWorker(workers);
                    break;
                case 4: director.showWorker(workers);
                    break;
                case 5: money.report(moneys);
                    break;
                case 6: director.paidSalary(workers);
                    break;
                case 7: director.muchSalary(workers);
                    break;
                case 8: director.paidTax(moneys);
                    break;
                case 0: i = 0;
                    break;
                default:
                    System.out.println("На работе пить низя");
            }
        }
    }

    void menuAdmin() {
        Administrator administrator = new Administrator();
        int i = 1;
        while (!(i == 0)) {
            System.out.println(
                    "\n1. Посмотреть всех клиентов" +
                    "\n2. Взять на ремонт технику" +
                    "\n3. Показать отчет" +
                    "\n4. Отдать отремонтированный товар" +
                    "\n5. Передать технику специалисту по ремонту" +
                    "\n0. Выход");
            int vybor = sc.nextInt();
            switch (vybor) {
                case 1:
                    administrator.showListClient(clients);
                    break;
                case 2:
                    administrator.addClient(clients);
                    break;
                case 3:
                    money.report(moneys);
                    break;
                case 4:
                    administrator.returnGaget(clients, moneys);
                    break;
                case 5:
                    administrator.toRepair(clients, repairman);
                    break;
                case 0: i = 0;
                    break;
                default:
                    System.out.println("На работе пить низя");
            }
        }
    }

    void menuRipairman() {
        Repairman repairman = new Repairman();
        int i = 1;
        while (!(i == 0)) {
            System.out.println(
                    "\n1. Ремонтировать" +
                    "\n2. Вернуть отремонтированную технику администраторуу" +
                    "\n0. Выход");
            int vybor = sc.nextInt();
            switch (vybor) {
                case 1:
                    Repairman.doSomething();
                    break;
                case 2:
                    repairman.returnGadget(clients);
                    break;
                case 0: i = 0;
                    break;
                default:
                    System.out.println("На работе пить низя");
            }
        }
    }
}