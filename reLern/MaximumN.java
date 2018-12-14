package reLern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxValue = Integer.MIN_VALUE;
        int n;
        int value = 0;
        try {
            System.out.println("Input size");
            value = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException exc) {
            System.out.println("invalid value");
        }
        n = value;
        for (int i = 0; i < n; i++) {
            System.out.println("input vale");
            value = Integer.parseInt(reader.readLine());
            if (maxValue < value) {
                maxValue = value;
            }
        }
        System.out.println("maximum value is - [" + maxValue+ "]");
    }
}
