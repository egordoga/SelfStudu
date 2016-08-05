package fool;

import java.util.Scanner;

/**
 * Created by Master on 15.07.2016.
 */
public class A {

//    int a;
//    int b;
//    int sum;
    Scanner sc = new Scanner(System.in);
    B b = new B();

    public int summa(int a, int b){
        return a+b;
    }

    public void print(int a, int b){

        System.out.println( summa(a, b));
    }


    void isChange(){
       // System.out.println("Цифра 0-2");
        int vvod = 2;     //sc.nextInt();
        b.changePole(vvod);
    }


    public String string(){
        String str = "";
        for (int i = 0; i < 4; i++) {
           str += i+" ,";
        }
        return str;
    }

    public void doIt(){
        System.out.println(b.isFree(b.b));
    }
}
