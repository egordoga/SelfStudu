package fool;

/**
 * Created by Master on 15.07.2016.
 */
public class A {

//    int a;
//    int b;
//    int sum;

    B b = new B();

    public int summa(int a, int b){
        return a+b;
    }

    public void print(int a, int b){

        System.out.println( summa(a, b));
    }

    public String string(){
        String str = "";
        for (int i = 0; i < 4; i++) {
           str += i+" ,";
        }
        return str;
    }

    public void doIt(){
        System.out.println(b.isFree(b.init()));
    }
}
