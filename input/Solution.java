package input;

import java.util.*;
import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
                for (; ; ) {
                    String line = reader.readLine();
                    if (line.equals("exit")) {
                        break;
                    }
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }
}
