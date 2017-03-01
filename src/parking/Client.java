package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class Client {

     private String name;
     private String phone;
     Car car;

    // typeId -> 1. motorcycle 2. car 3. minibus 4. freight car

    public Client() {
    }

    public Client(String name, String phone, Car car) {
        this.name = name;
        this.phone = phone;
        this.car = car;

    }

    public String toString(Client client){
        String str  = client.name + " " + client.phone + " " + client.car.getModel() + " " + client.car.getNumber()
                + " " + client.car.getTypeId() + " " + client.car.getNumberPlace();
                return str;
    }
}
