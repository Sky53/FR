package input.Buffered_Reader;

import java.io.*;
public class ReadLines {
    public static void main(String[] args) throws IOException {
        //Создать объект типа BufferReader
        //Связанный потоком Sistem.in
        BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in));

        String str;

        System.out.println("Введите тесктовые строки");
        System.out.println("Признак конца ввода - строка 'stop' ");

        do {
            str = br2.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
    }
}
