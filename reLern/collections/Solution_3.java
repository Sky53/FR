package reLern.collections;

import java.util.HashMap;
import java.util.Map;

public class Solution_3 {
    public static void main(String[] args) {
        Map<String, String> hMap = new HashMap<>();
        hMap.put("Sim", "Sim");
        hMap.put("Tom", "Tom");
        hMap.put("Arbus", "Arbus");
        hMap.put("Baby", "Baby");
        hMap.put("Cat", "Cat");
        hMap.put("Dog", "Dog");
        hMap.put("Eat", "Eat");
        hMap.put("Food", "Food");
        hMap.put("Gevey", "Gevey");
        hMap.put("Hugs", "Hugs");

        printKeys(hMap);
    }

    public static void printKeys(Map<String, String> map) {
        for (Map.Entry<String, String> maps : map.entrySet()) {
            String key = maps.getKey();
            System.out.println(key);
        }
    }
}
