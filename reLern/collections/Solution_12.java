package reLern.collections;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution_12 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Weyne");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> s : copy.entrySet()) {
            for (Map.Entry<String, String> s2 : copy.entrySet()) {
                if (s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) {
                    removeItemFromMapByValue(map, s.getValue());
                }
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) throws IOException {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
}
