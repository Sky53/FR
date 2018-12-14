package reLern.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution_13 {

    public static Map<String , Integer> createMap(){
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("A", 600);
        stringIntegerMap.put("B", 750);
        stringIntegerMap.put("C", 850);
        stringIntegerMap.put("D", 950);
        stringIntegerMap.put("F", 1100);
        stringIntegerMap.put("G", 450);
        stringIntegerMap.put("H", 400);
        stringIntegerMap.put("W", 300);
        stringIntegerMap.put("U", 390);
        stringIntegerMap.put("J", 150);

        return stringIntegerMap;
    }

    public static void removeItemFromMap(Map<String , Integer> map){
        Map<String, Integer> copyMap = new HashMap<>(map);

//        Iterator<Map.Entry<String, Integer>> iterator = copyMap.entrySet().iterator();

        for (Map.Entry<String , Integer> mapsik : copyMap.entrySet()) {
            if (mapsik.getValue() < 500) {
                map.remove(mapsik.getKey());
            }
        }
       // map = copyMap;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);

        System.out.println(map);

    }
}
