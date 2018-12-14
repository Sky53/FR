package reLern.collections;

import java.util.HashMap;
import java.util.Map;

public class Solution_2 {
    public static void main(String[] args) {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> mapCat = new HashMap<>(addCatsToMap(cats));
        for (Map.Entry<String,Cat> mC : mapCat.entrySet()){
            String key = mC.getKey();
            Cat value = mC.getValue();

            System.out.println(key+ " <=> " + value);
        }

    }

    public static Map<String, Cat> addCatsToMap(String[] cats){
        Map<String,Cat> map = new HashMap<>();
        for (int i = 0; i < cats.length; i++){
            map.put(cats[i], new Cat(cats[i]));
        }
        return map;
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}