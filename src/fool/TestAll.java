package fool;

/**
 * Created by Master on 04.08.2016.
 */
public class TestAll {

    public static void main(String[] args) {

        RealObject obj = new RealObject();
        Methods met = new Methods();

        obj.initMas();
        met.printMas(obj.toStringMas(obj.masik));
        met.change(obj.masik);
        met.printMas(obj.toStringMas(obj.masik));


    }
}
