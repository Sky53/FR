package reLern.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            stringList.add(reader.readLine());
        }
        reader.close();
        stringList.remove(2);

        for (String s : stringList){
            System.out.println(s);
        }
    }
}
