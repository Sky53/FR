package reLern.collections;

import java.util.HashMap;
import java.util.Map;


public class Solution_5 {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for (Map.Entry<String,Object> mapsik : map.entrySet()){
            String key = mapsik.getKey();
            Object value = mapsik.getValue();

            System.out.println(key + " <=> " + value);
        }
    }
}