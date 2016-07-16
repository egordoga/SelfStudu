package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class Area {

    int numberPlace;
    int typeId;
    boolean freePlace;
    //int quantityDays;
    //Date startDate;
    //Date endDate;


    public Area(){}
    public Area(int numberPlace, int typeId, boolean freePlace) {
        this.numberPlace = numberPlace;
        this.typeId = typeId;
        this.freePlace = freePlace;
    }

    Area place[] = new Area[50];



    public   void setPlace(){

        for (int i = 0; i <10; i++) {
            place[i] = new Area(i+1, 1, true);
        }
        for (int i = 10; i < 40; i++) {
            place[i] = new Area(i+1, 2, true);
        }
        for (int i = 40; i < 45; i++) {
            place[i] = new Area(i+1, 3, false);
        }
        for (int i = 45; i < 50; i++) {
            place[i] = new Area(i+1, 4, true);
        }


    }

    public  void showFree(){
        for (int i = 0; i < 50; i++) {
            if (place[i].freePlace){
                System.out.print( place[i].numberPlace + ", " );
            }
        }

    }
}
