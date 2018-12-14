package reLern.collections;

import java.util.HashMap;
import java.util.Map;

public class Solution_1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");
        map.put("картофель1", "клубень");
        map.put("картофель2", "клубень");

        for (Map.Entry<String,String> maps : map.entrySet()) {
            String key = maps.getKey();
            String value = maps.getValue();

            System.out.println(key + " <=> " + value);
        }
    }
}