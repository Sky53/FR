package reLern.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxIndex = 0;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }
        reader.close();
        for ( int j = 0; j < strings.size(); j++){
            if (strings.get(j).length() > max) {
                maxIndex = j;
                max = strings.get(j).length();
            }
        }
        System.out.println(strings.get(maxIndex));

    }
}