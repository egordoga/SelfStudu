    package parking;

    import java.util.Scanner;

    /**
     * Created by Master on 03.07.2016.
     */
    public class ConstantClient extends Client {

        int numberPlace;

        Scanner scanner = new Scanner(System.in);

        Area area = new Area();


        public ConstantClient() {}

        public ConstantClient(String name, String phone, String model,
                              String number, int typeId, int numberPlace) {
            super(name, phone, model, number, typeId);
            this.numberPlace = numberPlace;
        }

        ConstantClient[] listConstant = new ConstantClient[50];
        int size = 0;



        public void addConstClient(ConstantClient constantClient) {
            listConstant[size] = constantClient;
            size++;
        }

        public String toStringCC(ConstantClient constantClient){
            String str = constantClient.name + "  " + constantClient.phone + "  "
                        + constantClient.model + "  " + constantClient.number + "  "
                        + constantClient.numberPlace;
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



            ConstantClient constantClient = new ConstantClient(name, phone, model,number,typeId, numberPlace);
            addConstClient(constantClient);
            area.makeBusy(area.place, numberPlace);

             return constantClient;
        }

        }







