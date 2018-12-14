package reLern.collections;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution_11 {
    public static void main(String[] args) {
        Map<String, Date> map = new HashMap<>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 15 1980"));
        map.put("Stallone2", new Date("JUNE 30 1980"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone4", new Date("JULY 15 1980"));
        map.put("Stallone5", new Date("MAY 30 1980"));
        map.put("Stallone6", new Date("MAY 1 1980"));
        map.put("Stallone7", new Date("APRIL 15 1980"));
        map.put("Stallone8", new Date("AUGUST 25 1980"));
        map.put("Stallone9", new Date("NOVEMBER 1 1980"));

//        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String,Date> entry = iterator.next();
//            if (entry.getValue().getMonth() > 5 && entry.getValue().getMonth() < 9){
//                iterator.remove();
//            }
//        }
        Map<String, Date> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copyMap.entrySet()){
            if (pair.getValue().getMonth() > 5 && pair.getValue().getMonth() < 9) {
                map.remove(pair.getKey());
            }
        }

        for (Map.Entry<String,Date> mapa : map.entrySet()){

            String key = mapa.getKey();
            Date value = mapa.getValue();
            System.out.println(key + " <=> " + value);
        }
    }
}
