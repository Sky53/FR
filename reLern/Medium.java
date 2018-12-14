package reLern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Medium {
    public static void main(String[] args) throws IOException {
        Double reesult = 0.0;
        int count = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(bf.readLine());

        for (;;){
            if (temp == -1) {
                break;
            } else {
                reesult +=temp;
                count++;
                temp = Integer.parseInt(bf.readLine());
            }
        }


        System.out.println(reesult/count);
    }
}
