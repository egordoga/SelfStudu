package service.tests;

import java.time.LocalDate;

/**
 * Created by Master on 27.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        /*//Date currentDate = new Date();
        LocalDate localDate = LocalDate.of(1999,2,25);
        Scanner sc = new Scanner(System.in);
        String ff = sc.next();
        LocalDate release = LocalDate.parse(ff, DateTimeFormatter.ofPattern("d/M/yy"));
        System.out.println(release);
        //System.out.println(localDate);*/


//        ArrayList<Gadget> gadgets = new ArrayList<>();
//        gadgets.add(new Gadget());
//        gadgets.get(0).setInRepair(true);
//        gadgets.get(0).setInvoice(555);
//
//        System.out.println(gadgets.get(0).isInRepair());
//        System.out.println(gadgets.get(0).getInvoice()+3);

        LocalDate localDate = LocalDate.of(1999,5,25);
        int str = localDate.getMonthValue();
        System.out.println(str+45);

    }
}
