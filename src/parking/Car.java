package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class Car {

    private String model;
    private String number;
    private int typeId;
    // typeId -> 1. motorcycle 2. car 3. minibus 4. freight car


    public Car(String model, String number, int typeId) {
        this.model = model;
        this.number = number;
        this.typeId = typeId;
    }

    String toStringCar(Car car){
        String string = car.model + "  " + car.number + "  " + car.typeId;
        return string;
    }
}
