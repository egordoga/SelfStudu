    package parking;

    import java.util.Scanner;

    /**
     * Created by Master on 03.07.2016.
     */
    public class ConstantClient extends Client {

        int place;

        Scanner scanner = new Scanner(System.in);
        ConstantClient constantClient;

        //public ConstantClient(){};




        public ConstantClient(String name, String phone, Car car, int place) {
            super(name, phone, car);
            this.place = place;
        }

        ConstantClient[] listConstant = new ConstantClient[50];
        int size = 0;

        //public ConstantClient() {
            //super(name, phone, Car car);
        //}

        public void addConstClient(ConstantClient constantClient) {
            listConstant[size] = constantClient;
            size++;
        }




         void addConstantClient(){
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

            Area area = new Area();
            area.showFree();

            System.out.println("Input car place");
            int place = scanner.nextInt();


            Car car = new Car(model, number, typeId);
            ConstantClient constantClient = new ConstantClient(name, phone, car, place);
            addConstClient(constantClient);
        }
            //contactList.addContact(contact);
            //listConstant.a
        }







