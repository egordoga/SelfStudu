package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class Client {

     String name;
     String phone;
     Car car;
     //String model;
     //String number;
     //int typeId;
    // typeId -> 1. motorcycle 2. car 3. minibus 4. freight car

    public Client() {
    }

    public Client(String name, String phone, Car car) {
        this.name = name;
        this.phone = phone;
        this.car = car;
       // this.model = model;
       // this.number = number;
        //this.typeId = typeId;
    }

    public String toString(Client client){
        String str  = client.name + " " + client.phone + " " + car.toString();
                return str;
    }
}
