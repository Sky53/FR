package input.shpw_file;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.*;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

public class ShowFile_1 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

//        Прежде всего необходимо убедиться в том, что программе
//        передаеться имя файла

        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);// открыть файл
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден");
            return;
        }
        try {
            // Читать байты пока не встретиться символ EOF
            do {
                i = fin.read(); //чтения из файла
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении файла");
        } finally {


            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}


