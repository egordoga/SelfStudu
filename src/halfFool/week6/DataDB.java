package halfFool.week6;

import com.google.gson.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Мастер on 01.03.2017.
 */
public class DataDB {
    Data data1 = new Data("Valia", 11, "111-111-111");
    Data data2 = new Data("Petia", 22, "222-222-222");
    Data data3 = new Data("Igor", 33, "333-333-333");
    Data data4 = new Data("Sveta", 44, "444-444-444");
    Data data5 = new Data("Sasha", 55, "555-555-555");
    Data data6 = new Data("Roman", 66, "666-666-666");

    List<Data> list = new ArrayList<>();
    Gson gson = new Gson();

    public void initList(){
        list.add(data1);
        list.add(data2);
        list.add(data3);
        list.add(data4);
        list.add(data5);
        list.add(data6);
    }

    public void toJSON(){

        //String json = gson.toJson();
        for (Data data : list) {
            String json = gson.toJson(data);
            System.out.println(json);
        }
    }
}
