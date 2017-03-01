package service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Master on 05.09.2016.
 */
public class Repairman extends Worker implements IPaid {

    private int idRepairman;

    Scanner sc = new Scanner(System.in);


    public Repairman(){}
    public Repairman(String name, String phone, int profID, int idRepairman) {
        super(name, phone, profID);
        this.idRepairman = idRepairman;

    }

    public int getIdRepairman() {
        return idRepairman;
    }

    public void setIdRepairman(int idRepairman) {
        this.idRepairman = idRepairman;
    }


    public static void doSomething()  {
        System.out.println("Vzyat payalnik && otvertka" +
                "\nPotykat into gadget" +
                "\nVse ready" +
                "\nSay 'replaced half of gadget'");

    }

    public void returnGadget(ArrayList<Client> clients){
        System.out.println("Number of invoice");
        int number = sc.nextInt();
        for (int i = clients.size()-1; i < -1 ; i--) {
            if (clients.get(i).getGadget().getInvoice() == number){
               clients.get(i).getGadget().setInRepair(false);
               clients.get(i).getGadget().setReadyGadget(true);
            }
        }
    }
}
