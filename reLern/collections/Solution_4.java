package reLern.collections;

import java.util.HashMap;
import java.util.Map;

public class Solution_4 {
    public static void main(String[] args) {
        Map<String, String> hMaps = new HashMap<>();
        hMaps.put("Sim", "Sim");
        hMaps.put("Tom", "Tom");
        hMaps.put("Arbus", "Arbus");
        hMaps.put("Baby", "Baby");
        hMaps.put("Cat", "Cat");
        hMaps.put("Dog", "Dog");
        hMaps.put("Eat", "Eat");
        hMaps.put("Food", "Food");
        hMaps.put("Gevey", "Gevey");
        hMaps.put("Hugs", "Hugs");

        printValues(hMaps);
    }

    public static void printValues(Map<String, String> map) {
        for (Map.Entry<String, String> mapsValue : map.entrySet()) {
            String value = mapsValue.getValue().toUpperCase();
            System.out.println(value);
        }
    }
}
