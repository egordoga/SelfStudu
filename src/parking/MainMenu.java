package parking;

import java.util.Scanner;

/**
 * Created by Master on 06.07.2016.
 */
public class MainMenu {

    private Scanner scanner = new Scanner(System.in);


    Car car = new Car();
    Area area = new Area();
   // Area[] place = new Area[10];




    public void start(Area[] place){


        while(true){

            System.out.println("1.Проверить свободные места");
            System.out.println("2. Парковать ТС");
            System.out.println("3. Освободить место");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.println(area.toStreengFree(place));
            } else if(choice == 2){
                car.park(place);
            } else if(choice == 3){
                car.unPark(place);
            } else {
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
