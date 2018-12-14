package reLern.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        reader.close();

        for (int i = 0; i < 13; i++){
            String bufString = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0,bufString);
        }

        for (String string : list){
            System.out.println(string);
        }

    }
}
