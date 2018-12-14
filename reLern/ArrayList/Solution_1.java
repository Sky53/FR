package reLern.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        int minIndex = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i< 5; i++){
            list.add(reader.readLine());
        }
        reader.close();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                minIndex = i;
                min = list.get(i).length();
            }
        }

        System.out.println(list.get(minIndex));
    }
}
