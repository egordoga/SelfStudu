package service;

public class Worker extends Human implements IPaid{

    private int profID;
    /*
    1 - director
    2 - administrator
    3 - repairman
     */
    private int salary;

   // ArrayList<Worker> workers = new ArrayList<>();


    @Override
    public void getPaid(int profID) {

    }
    public Worker(){}

    public Worker(String name, String phone, int profID, int salary) {
        super(name, phone);
        this.profID = profID;
        this.salary = salary;
    }

    public Worker(String name, String phone, int profID) {
        super(name, phone);
        this.profID = profID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{name=" + getName() + ", phone=" + getPhone() +
                ", profID=" + profID +
                ", salary=" + salary +
                '}';
    }
}
