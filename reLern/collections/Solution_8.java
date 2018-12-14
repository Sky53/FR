package reLern.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Solution_8 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < 20; i++){
            set.add("Л" + i);
        }

        for (String s : set){
            System.out.println(s);
        }
    }
}
