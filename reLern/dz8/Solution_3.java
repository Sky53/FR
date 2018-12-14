package reLern.dz8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        System.out.println("enter size list");
        int value = Integer.parseInt(reader.readLine());
        for (int i = 0; i < value; i++){
            System.out.println("enter" + i + " element");
            set.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer val : set){
            if (min > val){
                min = val;
            }
        }
        int min2 = Collections.min(set);
        System.out.println( "Minimum is - [" +min+"]");
        System.out.println( "Minimum2 is - [" +min2+"]");


    }
}
