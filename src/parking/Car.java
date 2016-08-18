package parking;

import java.util.Scanner;

/**
 * Created by Master on 03.07.2016.
 */
public class Car {

     String model;
     String number;
    int numberPlace;
     int typeId;
    // typeId -> 1. motorcycle 2. car 3. minibus 4. freight car

    Scanner sc = new Scanner(System.in);


    public Area[] place = new Area[10];
    
    public Car(){}


    public Car(String model, String number, int typeId) {
        this.model = model;
        this.number = number;
        this.typeId = typeId;
    }



    public Area[] initArea(){

        for (int i = 0; i < 10; i++) {

            place[i] = new Area(i+1,false);
        }
        return place;
    }

    public void park(Area[] place){

        System.out.println("Введите номер места");
        int mesto = sc.nextInt();

        this.numberPlace = place[mesto - 1].numberPlace;
        place[mesto - 1].busyPlace = true;
    }

    public void unPark(Area[] place){

        System.out.println("Введите номер освобождаещегося места");
        int mesto = sc.nextInt();
        place[mesto - 1].busyPlace = false;
    }

    String toString(Car car){
        String string = car.model + "  " + car.number + "  " + car.typeId;
        return string;
    }
}
