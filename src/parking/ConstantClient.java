    package parking;

    import java.util.Scanner;

    /**
     * Created by Master on 03.07.2016.
     */
    public class ConstantClient extends Client {

        int numberPlace;

        Scanner scanner = new Scanner(System.in);
        ConstantClient constantClient;

        Area area = new Area();


        public ConstantClient() {
        }

        public ConstantClient(String name, String phone, Car car, int numberPlace) {
            super(name, phone, car);
            this.numberPlace = numberPlace;
        }

        ConstantClient[] listConstant = new ConstantClient[50];
        int size = 0;



        public void addConstClient(ConstantClient constantClient) {
            listConstant[size] = constantClient;
            size++;
        }

        public String toStringCC(ConstantClient constantClient){
            String str = constantClient.name + "  " + constantClient.phone + "  " + constantClient.car + "  " + constantClient.numberPlace;
            return str;

        }

        public void showListConstClient (String str){
            for (int i = 0; i < size; i++) {
                System.out.println(str);
            }
        }




         ConstantClient addConstantClient(/*String string*/){
             System.out.println("Input name");
             String name = scanner.next();
             System.out.println("Input phone");
             String phone = scanner.next();
             System.out.println("Input car model");
             String model = scanner.next();
             System.out.println("Input car number");
             String number = scanner.next();
             System.out.println("Input car ID");
             int typeId = scanner.nextInt();


             System.out.println(area.showFree(area.setPlace()));

            System.out.println("Input car numberPlace");
            int numberPlace = scanner.nextInt();


            Car car = new Car(model, number, typeId);
            ConstantClient constantClient = new ConstantClient(name, phone, car, numberPlace);
            addConstClient(constantClient);
            area.makeBusy(numberPlace);

             return constantClient;
        }

        }







