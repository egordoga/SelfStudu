package service;

public class Client extends Human{

    private int codeID;
    private Gadget gadget;

    public  Client(){}
    public Client(String name, String phone, int codeID, Gadget gadget) {
        super(name, phone);
        this.codeID = codeID;
        this.gadget = gadget;
    }

    public String toString(Client client){
        String str = client.getName() + ", " + client.getPhone() + ", " + client.codeID + ", "
                + gadget.toString(client.gadget);
        return str;
    }




    public int getCodeID() {
        return codeID;
    }

    public Gadget getGadget() {
        return gadget;
    }
}
