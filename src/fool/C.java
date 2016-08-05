package fool;

/**
 * Created by Master on 15.07.2016.
 */
public class C {

    public static void main(String[] args) {

        A a= new A();
        B b = new B();
        a.print(22,4);
        b.print1("KJHKJ  " + a.string());
        a.doIt();
        a.isChange();
        a.doIt();

    }
}
