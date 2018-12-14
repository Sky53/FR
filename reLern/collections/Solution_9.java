package reLern.collections;

import Packages_interfaces.extendsi.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution_9 {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 20; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            set.add(Integer.parseInt(reader.readLine()));
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next()>10){
                iterator.remove();
            }
        }

        for (Integer x : set){
            System.out.println(x);
        }
    }
}
