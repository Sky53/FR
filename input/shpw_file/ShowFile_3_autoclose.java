package input.shpw_file;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile_3_autoclose {
    public static void main(String[] args) {
        int i;
        //программе передаются имена обоих файлов?
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }
        //Использование try с ресурсами для открытия файла с последующим его закрытием
        //После того, как будет покинут блок try
        try (FileInputStream fin4 = new FileInputStream(args[0])) {
            do {
                i = fin4.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);


        } catch (IOException exc) {
            System.out.println("Ошибка ввода - вывовода: " + exc);
        }
    }
}
