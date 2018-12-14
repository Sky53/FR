package input.shpw_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * В этой версии программы те ее части, которые отвечают
 * за открытие файла и получения доступа к нему, помещены
 * в один блок try. Файл закрываеться в блоке finally
 */
public class ShowFile_2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin2 = null;

        // Пережде всеге необходимо убедиться в том, что программе
        // пердоставляеться имя файла

        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }
        // Открытия файла, чтение из него символов, пока
        // не встретиться признак конца файла EOF, и последуещее закрытие файла в блоке finally
        try {
            fin2 = new FileInputStream(args[0]);// открыть файл

            do {
                i = fin2.read(); //чтения из файла
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден");
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода");
        } finally {
            // Файл закрываеться в любом случае
            try {
                if (fin2 != null) {
                    fin2.close();
                }
            } catch (IOException exc) {
                System.out.println(" Ошибка при закрытии файло");
            }
        }
    }
}