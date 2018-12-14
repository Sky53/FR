package input.filewriter;
// Пример простой утилиты для чтения данных с диска и вывода их
// на экран, демонстрирующий использование класса FileReader
import java.io.*;
class DtoS {
    public static void main(String[] args) {
        String s;
        // Создать и использовать объект FileReader, помещенный
        // в оболочку на основе класса BufferedReader
        try(BufferedReader br3 = new BufferedReader(new FileReader("Test.txt"))) {
            while ((s = br3.readLine()) != null) {
                System.out.println(s);
            }
        }catch (IOException exc) {
            System.out.println("Error input-output");

        }
    }
}
