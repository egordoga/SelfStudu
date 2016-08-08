package fool;

/**
 * Created by Master on 04.08.2016.
 */
public class RealObject {
    int chislo;
    String stroka;
    boolean logic;



    RealObject(){}

    public RealObject(int chislo, String stroka, boolean logic) {
        this.chislo = chislo;
        this.stroka = stroka;
        this.logic = logic;
    }



    String toStringMas(RealObject[] mas){
        String str = "";
        for (int i = 0; i < mas.length; i++) {
            str += mas[i].chislo + " " + mas[i].stroka + " " + mas[i].logic + "\n";
        }
        return str;
    }
}
