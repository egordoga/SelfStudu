package halfFool.week6;


import com.google.gson.Gson;

public class RunJson {
    public static void main(String[] args) {

        Gson gson = new Gson();
        DataDB dataDB = new DataDB();
        dataDB.initList();
        //dataDB.tJSON();
        Object[] listArr =  dataDB.list.toArray();
        String json = gson.toJson(listArr);

        System.out.println(json);
    }

}
