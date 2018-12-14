package reLern.dz8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        char[] charsArray = str.toCharArray();
        charsArray[0] = Character.toUpperCase(charsArray[0]);
        for (int i = 0; i < charsArray.length; i++){
            if (charsArray[i] == ' '){
                charsArray[i+1] = Character.toUpperCase(charsArray[i+1]);
            }
        }

        for (Character character : charsArray){
            System.out.print(character);
        }
    }
}
