package input.copyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin3 = null;
        FileOutputStream fout = null;

        // Необходимо учесть, что  программе передоставляются имена обоих файлов

        if (args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }
        //Копирование файлов
        try {
            // Попытка открытия
            fin3 = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin3.read(); //чтения из файла
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        } finally {
            try {
                if (fin3 != null) {
                    fin3.close();
                }
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии входного файла");
            }
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException exc) {
                System.out.println("Ошибка при звкрытии выходного файла");
            }
        }
    }
}
