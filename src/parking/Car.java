package parking;

import java.util.Scanner;

/**
 * Created by Master on 03.07.2016.
 */
public class Car {

     private String model;
     private String number;
     private int numberPlace;
     private int typeId;
    // typeId -> 1. motorcycle 2. car 3. minibus 4. freight car

    Scanner sc = new Scanner(System.in);


    public Area[] place = new Area[10];
    //ListClient listClient = new ListClient();
    
    public Car(){}


    public Car(String model, String number, int typeId, int numberPlace) {
        this.model = model;
        this.number = number;
        this.typeId = typeId;
        this.numberPlace = numberPlace;
    }


    public String getModel() {
        return model;
    }

    /*public void setModel(String model) {
        this.model = model;
    }*/

    public String getNumber() {
        return number;
    }

    /*public void setNumber(String number) {
        this.number = number;
    }*/

    public int getNumberPlace() {
        return numberPlace;
    }

    /*public void setNumberPlace(int numberPlace) {
        this.numberPlace = numberPlace;
    }*/

    public int getTypeId() {
        return typeId;
    }

    /*public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    /*public Area[] initArea(){

        for (int i = 0; i < 10; i++) {

            place[i] = new Area(i+1,false);
        }
        return place;
    }

   /* public void park(Client[] clients, Client client){

       this.numberPlace = clients[client.car.numberPlace - 1].getNumberPlace();
        //place[client.car.numberPlace - 1].area.isBusyPlace() = true;
    }*/

    public void unPark(/*Area[] place*/ Client[] listClients){

        System.out.println("Введите номер освобождаещегося места");
        int mesto = sc.nextInt();
        //place[mesto - 1] = null;
        listClients[mesto-1] = null;
    }

    /*String toString(Car car){
        String string = car.model + "  " + car.number + "  " + car.typeId;
        return string;
    }*/

    public String toStreengFree(Client[] clients){
        String str = "";
        for (int i = 0; i < 10; i++) {
            if (clients[i] == null) {
                str += (i + 1) + ", ";
            }
        }
        return str;
    }

}
