package parking.Tests;

import parking.Area;
import parking.Car;
import parking.MainMenu;

/**
 * Created by Master on 14.08.2016.
 */
public class TestMainMenu {

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        Car car = new Car();
        Area area = new Area();

        car.initArea();
        mainMenu.start(car.place);
    }
}
