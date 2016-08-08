package fool;

/**
 * Created by Master on 04.08.2016.
 */
public class Methods {


    RealObject[] masik = new RealObject[5];

    void printMas(String string){
        System.out.println(string);
    }

     void initMas(){
        String str = "masik";
        for (int i = 0; i < 5; i++) {
            masik[i] = new  RealObject(i, str + i, true);
        }

    }

    void change(RealObject[] mas){
        int vvod = 2;
        int vvod1 = 3;
        mas[vvod].logic = false;
        mas[vvod1].stroka = "Igor";
    }



}
