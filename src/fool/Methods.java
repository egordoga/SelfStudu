package fool;

/**
 * Created by Master on 04.08.2016.
 */
public class Methods {


    public RealObject[] masik = new RealObject[5];

    public void printMas(String string){
        System.out.println(string);
    }

     public void initMas(){
        String str = "masik";
        for (int i = 0; i < 5; i++) {
            masik[i] = new  RealObject(i, str + i, true);
        }

    }

    public void change(RealObject[] mas){
        int vvod = 2;
        int vvod1 = 3;

        mas[vvod].logic = false;
        mas[vvod1].stroka = "Igor";
    }



}
