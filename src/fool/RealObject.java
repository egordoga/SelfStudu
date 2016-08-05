package fool;

/**
 * Created by Master on 04.08.2016.
 */
public class RealObject {
    int chislo;
    String stroka;
    boolean logic;

    RealObject[] masik = new RealObject[5];

    RealObject(){}

    public RealObject(int chislo, String stroka, boolean logic) {
        this.chislo = chislo;
        this.stroka = stroka;
        this.logic = logic;
    }

    void initMas(){
        String str = "masik";
        for (int i = 0; i < 5; i++) {
            masik[i] = new RealObject(i, str + i, true);
        }

    }

    String toStringMas(RealObject[] mas){
        String str = "";
        for (int i = 0; i < mas.length; i++) {
            str += mas[i].chislo + " " + mas[i].stroka + " " + mas[i].logic + "\n";
        }
        return str;
    }
}
