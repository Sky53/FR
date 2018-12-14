package input.shpw_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowFile_4_autcls {
    public static void main(String[] args) {
        int i;
        //программе передаются имена обоих файлов?
        if (args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }
        //Использование try с ресурсами для открытия файла с последующим его закрытием
        //После того, как будет покинут блок try
        try (FileInputStream fin5 = new FileInputStream(args[0]);
             FileOutputStream four5 = new FileOutputStream(args[1])) {
            do {
                i = fin5.read();
                if (i != -1) {
                    four5.write(i);
                }
            } while (i != -1);


        } catch (IOException exc) {
            System.out.println("Ошибка ввода - вывовода: " + exc);
        }
    }
}


