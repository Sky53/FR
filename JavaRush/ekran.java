package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ekran {
    public static void main(String[] args) throws IOException {
//        String str = "Java said? \"Hello World!\"";
//        System.out.println("Java said? \"Hello World!\"");
//        System.out.println(str);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        System.out.println(str);
        String ch = bf.readLine();
    }
}
