package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class Client {

     String name;
     String phone;
     //Car car;
     String model;
     String number;
     int typeId;
    // typeId -> 1. motorcycle 2. car 3. minibus 4. freight car

    public Client() {
    }

    public Client(String name, String phone, String model, String number, int typeId) {
        this.name = name;
        this.phone = phone;
        this.model = model;
        this.number = number;
        this.typeId = typeId;
    }
}
