package reLern.files;

import java.io.*;

public class SR {

    public static void main(String[] args) throws Exception {
        //эту строку должен будет прочитать Reader
        String test = "Hi!\n My name is Richard\n I'm a photographer\n";
        //заворачиваем строку в StringReader
        StringReader reader = new StringReader(test);
        //Создаем объект StringWriter
        StringWriter writer = new StringWriter();
        //переписываем строки из Reader во Writer, предварительно развернув их
        executor(reader, writer);
        System.out.println(writer);
        System.out.println();
        System.out.println();
        String result = writer.toString();
        System.out.println(result);

    }

    private static void executor(Reader reader, Writer writer) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line; // Читаем строку из reader'a
        while ((line = bufferedReader.readLine()) != null) {
            StringBuilder stringBuilder = new StringBuilder(line);
            String newLine = stringBuilder.reverse().toString();
            writer.write(newLine + "\n");
        }
    }

}
