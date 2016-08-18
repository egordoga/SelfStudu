    package parking;

    /**
     * Created by Master on 03.07.2016.

    public class ConstantClient extends Client {

        int numberPlace;

        Scanner scanner = new Scanner(System.in);

        Area[] area = new Area[20];


        public ConstantClient() {}

        public ConstantClient(String name, String phone, String model,
                              String number, int typeId, int numberPlace) {
            super(name, phone, model, number, typeId);
            this.numberPlace = numberPlace;
        }

        ConstantClient[] listConstant = new ConstantClient[20];
        int sizeMoto = 0;
        int sizeCar = 4;
        int sizeMini = 9;
        int sizeFreight = 14;



        public void addConstClient(ConstantClient constantClient) {
            if (constantClient.typeId == 1) {
                listConstant[sizeMoto] = constantClient;
                area[sizeCar].
                sizeMoto++;
            } else {
                if (constantClient.typeId == 2) {
                    listConstant[sizeCar] = constantClient;
                    sizeCar++;
                } else {
                    if (constantClient.typeId == 3) {
                        listConstant[sizeMini] = constantClient;
                        sizeMini++;
                    } else {
                            listConstant[sizeFreight] = constantClient;
                            sizeFreight++;

                    }
                }
            }
        }

        public String toStringCC(ConstantClient constantClient){
            String str = constantClient.name + "  " + constantClient.phone + "  "
                        + constantClient.model + "  " + constantClient.number + "  "
                        + constantClient.numberPlace;
            return str;

        }

        public void showListConstClient (String str){
            for (int i = 0; i < sizeMoto; i++) {
                System.out.println(str);
            }
        }




         ConstantClient addConstantClient(/*String string){
             System.out.println("Input name");
             name = scanner.next();
             System.out.println("Input phone");
             phone = scanner.next();
             System.out.println("Input car model");
             model = scanner.next();
             System.out.println("Input car number");
             number = scanner.next();
             System.out.println("Input car ID");
             typeId = scanner.nextInt();


            // System.out.println(area.toStreengFree(area.setPlace()));

            System.out.println("Input car numberPlace");
            area.numberPlace = scanner.nextInt();



            ConstantClient constantClient = new ConstantClient(name, phone, model,number,typeId, numberPlace);
            addConstClient(constantClient);
            //area.makeBusy(numberPlace);

             return constantClient;
        }

        }*/







