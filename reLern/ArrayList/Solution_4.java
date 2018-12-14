package reLern.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        int buf;
        for (int i = 0; i < 10; i++){
            stringList.add(reader.readLine());
        }
        reader.close();

        for (int i = 0; i < stringList.size(); i++){
            if (stringList.get(i).length() > max) {
                maxIndex = i;
                max = stringList.get(i).length();
            }
            if (stringList.get(i).length() < min) {
                minIndex = i;
                min = stringList.get(i).length();
            }
        }

        System.out.println("Maximum - " + stringList.get(maxIndex));
        System.out.println("Minimum - " + stringList.get(minIndex));
    }
}
