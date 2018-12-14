package reLern.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class RAF {
    public static void main(String[] args) throws IOException {
        String test = "Hi!\nMy name is Richard\nI'm a photographer\n";
        //System.out.println(true);
        //System.out.println(test);

        //это строчка – ключевая: мы «превратили» строку в Reader
        StringReader reader = new StringReader(test);

        executor(reader);

    }

    private static void executor(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
