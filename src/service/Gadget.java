package service;

import java.time.LocalDate;

public class Gadget {

    private String nazva;
    private int price;
    private LocalDate release;
    private LocalDate ready;
    private boolean inRepair = false;
    private boolean readyGadget = false;
    private int invoice = 0;

    public Gadget() {
    }


    public Gadget(String nazva, int price, LocalDate release, LocalDate ready,
                  boolean inRepair, boolean readyGadget, int invoice) {
        this.nazva = nazva;
        this.price = price;
        this.release = release;
        this.ready = ready;
        this.inRepair = inRepair;
        this.readyGadget = readyGadget;
        this.invoice = invoice;
    }

    public int getPrice() {
        return price;
    }

    public boolean isInRepair() {
        return inRepair;
    }

    public void setInRepair(boolean inRepair) {
        this.inRepair = inRepair;
    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    public boolean isReadyGadget() {
        return readyGadget;
    }

    public void setReadyGadget(boolean readyGadget) {
        this.readyGadget = readyGadget;
    }

    public LocalDate getRelease() {
        return release;
    }

    String toString(Gadget gadget){
        String str = gadget.nazva + ", " + gadget.price + ", " + gadget.ready + ", " + gadget.release
                + ", " + gadget.invoice + ", " +gadget.inRepair + ", " + gadget.readyGadget;
        return str;
    }
}
