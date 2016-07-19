package example;

public class Test {

    public static void main(String[] args) {
        Array1[] arr = new Array1[3];

        for(int i=0; i<3;i++){
            arr[i] = new Array1(i+3,i*2);
            //arr[0] = arr.getArray(3,5);

        }

    }}
class Array1 {

    int a;
    int b;


    public  Array1(int a, int b){
        this.a = a;
        this.b = b;
       // return Array1;
    }

}

