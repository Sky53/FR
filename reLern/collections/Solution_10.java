package reLern.collections;

import java.util.HashMap;
import java.util.Map;

public class Solution_10 {
    public static void main(String[] args) {
        int countF = 0;
        int countI = 0;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Фамилия_" + i, "Name_" + i);
        }

        for (Map.Entry<String, String> puos : map.entrySet()) {
            String key = puos.getKey();
            String value = puos.getValue();
            if ("Фамилия_1".equals(key)){
                countF++;
            }
            if ("Name_2".equals(value)){
                countI++;
            }
        }


        System.out.println(countF);
        System.out.println(countI);
    }
}
