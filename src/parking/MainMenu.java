package parking;

import java.util.Scanner;

/**
 * Created by Master on 06.07.2016.
 */
public class MainMenu {

    private Scanner scanner = new Scanner(System.in);


    public void start(){


        while(true){

            System.out.println("1.Проверить свободные места");
            System.out.println("2. Добавить постоянного клиента");
            System.out.println("3. Парковать ТС");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if(choice == 1){
               // showAddContactMenu();
            } else if(choice == 2){
               // showAllContactsMenu();
            } else if(choice == 3){
               // showContactDetailsMenu();
            } else if(choice == 0){
                break;
            }

        }
    }

    /*private void showContactDetailsMenu() {
        System.out.println("Input contact position");
        int postion = scanner.nextInt();

        Contact contact = contactList.getContact(postion);
        System.out.println(contact.toJson());
    }

    private void showAllContactsMenu() {
        System.out.println(contactList.asString());
    }

    private void showAddContactMenu(){
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Input phone");
        String phone = scanner.next();

        Contact contact = new Contact();
        contact.initContact(name,phone);
        contactList.addContact(contact);

    }*/



}
