package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class Area {

    int numberPlace;
    boolean busyPlace;

    public Area(int numberPlace, boolean busyPlace) {
        this.numberPlace = numberPlace;
        this.busyPlace = busyPlace;
    }

    public Area(){}

    //Area[] place = new Area[10];

    Car car = new Car();
    //MainMenu mm = new MainMenu();


    public String toStreengFree(Area[] place){
        String str = "";
        for (int i = 0; i < 10; i++) {
            if (!place[i].busyPlace) {
                str += (i + 1) + ", ";
            }
        }
        return str;
    }


}
    //int typeId;
    //int quantityDays;
    //Date startDate;
    //Date endDate;


   /* public Area() {
    }

    public Area(int numberPlace, int typeId, boolean freePlace) {
        this.numberPlace = numberPlace;
        this.typeId = typeId;
        this.BusyPlace = freePlace;
    }

    /*Area place[] = new Area[50];
    //Area area = new Area();

    public Area[] setPlace() {

        for (int i = 0; i < 10; i++) {
            place[i] = new Area(i + 1, 1, true);
        }
        for (int i = 10; i < 40; i++) {
            place[i] = new Area(i + 1, 2, false);
        }
        for (int i = 40; i < 45; i++) {
            place[i] = new Area(i + 1, 3, false);
        }
        for (int i = 45; i < 50; i++) {
            place[i] = new Area(i + 1, 4, true);
        }
        return place;

    }

    public String toStreengFree(Area[] place) {
        String str = "";
        for (int i = 0; i < 20; i++) {

            if (!place[i].BusyPlace) {

                str += place[i].numberPlace + " ,";
            }
        }
        return str;
    }


   public void makeBusy(int i) {
        place[i].BusyPlace = false;
    }
}*/
