package fool;

/**
 * Created by Master on 14.08.2016.
 */
public class OneMoreMethod {


    Methods methods = new Methods();

    public void moreChange(RealObject[] mas){
        int temp = 1;
        methods.change(mas);
       mas[temp].stroka = "Vasia";
       mas[temp].chislo = 23;



    }
}
