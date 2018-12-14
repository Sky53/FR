package reLern.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Solution_7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size(); i++){
            list.add(i+1,"именно");
            i++;
        }

        for (String s : list){
            System.out.println(s);
        }
    }
}
