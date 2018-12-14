package JavaRush.help;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Words2 {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0 , "ноль");
        map.put(1 , "один");
        map.put(2 , "два");
        map.put(3 , "три");
        map.put(4 , "четыре");
        map.put(5 , "пять");
        map.put(6 , "шесть");
        map.put(7 , "семь");
        map.put(8 , "восемь");
        map.put(9 , "девять");
        map.put(10 , "десять");
        map.put(11 , "одиннадцать");
        map.put(12 , "двенадцать");
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader readFile = new BufferedReader(new FileReader(file));
        while (readFile.ready()) {
            String line = readFile.readLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                for (Integer key : map.keySet()) {
                    if (words[i].equals(key)) {
                        //  line.replace(words[i], map.get(key));
                        words[i] = map.get(key);
                    }
                }
            }
            StringBuilder builder = new StringBuilder();
            for(String s : words) {
                builder.append(s + " ");
            }
            String str = builder.toString().trim();
            System.out.println(str);

        }
        readFile.close();
    }
}
