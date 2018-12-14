package reLern.dz8;

import org.omg.CORBA.Object;

import java.util.HashMap;
import java.util.Map;

public class Solution_2 {
    public static Map<String,String> createPeopleList(){
        Map<String, String> map = new HashMap<>();
        map.put("Петров","Вася");
        map.put("Петров","Коля");
        map.put("Сидоров","Вася");
        map.put("Иванов","Юра");
        map.put("Яковлев","Саша");
        map.put("Стоянов","Дима");
        map.put("Кусков","Ваня");
        map.put("Шнурков","Рома");
        map.put("Рачук","Гена");
        map.put("Бабиков","Кирилл");

        return map;
    }

    public static void printPeopleList(Map<String, String> map){
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key + " <=> " + value);
        }
    }
    public static void main(String[] args) {
        Map<String, String>  map = createPeopleList();
        printPeopleList(map);

    }
}
