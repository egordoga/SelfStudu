package fool;

/**
 * Created by Master on 15.07.2016.
 */
public class B {
    int aa;
    boolean bb;

    public B(){}
    public B(int aa, boolean bb) {
        this.aa = aa;
        this.bb = bb;
    }

    B[] b = new B[3];

    public B[] init(){
        for (int i = 0; i < 3; i++) {
            this.b[i] = new B(i,true);
        }
        return b;
    }

    public String isFree(B[] b){
        String str = "Igor";
        for (int i = 0; i < 3; i++) {
            if(b[i].bb){
                str+= " ," + b[i].aa + i + 1;
            }
        }
        return str;
    }

    public void print1(String str){
        System.out.println(str);
    }

}
