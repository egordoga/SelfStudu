package halfFool.week6;

/**
 * Created by Мастер on 01.03.2017.
 */
public class Data {
    private String name;
    private int value;
    private String phone;

    public Data(String name, int value, String phone) {
        this.name = name;
        this.value = value;
        this.phone = phone;
    }

    public Data() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
