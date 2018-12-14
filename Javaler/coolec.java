package Javaler;

import java.util.*;

public class coolec {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");
        List<String> list = new ArrayList<String>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

//        Iterator<String> iterator = set.iterator();
//
//        while (iterator.hasNext()) {
//            String text = iterator.next();
//
//            System.out.println(text);
//        }

        for (String texr : list){
            System.out.println(texr);
        }
    }
}
