package reLern.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Solution_14 {

    public static class Cat{

    }

    public static Set<Object> createCats(){
        Set<Object> catSet = new HashSet<>();
        catSet.add(new Cat());
        catSet.add(new Cat());
        catSet.add(new Cat());

        return catSet;
    }

    public static void printCats(Set<Object> set){
        for (Object s : set)
        System.out.println(s);
    }

    public static void main(String[] args) {
        Set<Object> set = createCats();
        set.remove(set.toArray()[0]);
        printCats(set);
    }
}
