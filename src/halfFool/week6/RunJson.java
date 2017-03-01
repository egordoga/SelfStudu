package halfFool.week6;

/**
 * Created by Мастер on 01.03.2017.
 */
public class RunJson {
    public static void main(String[] args) {


        DataDB dataDB = new DataDB();
        dataDB.initList();
        dataDB.toJSON();
    }

}
