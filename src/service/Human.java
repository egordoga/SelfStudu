package service;

public class Human {

    private String name;
    private String phone;


    public Human(){}

    public Human(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
