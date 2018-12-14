package input.filewriter;
// Пример простой утилиты для ввода данных с клавиатуры и
// записи их на диск, демонстрирующий использование класса
// FileWriter

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class KtoD {
    public static void main(String[] args) {
        String str1;
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Пpизнaк конца ввода - строка 'stop'");

        try (FileWriter fw1 = new FileWriter("Test.txt")) {
            do {
                System.out.println(": ");
                str1 = br1.readLine();
                if (str1.compareTo("stop") == 0) {
                    break;
                }
                str1 = str1 + "\r\n";
                fw1.write(str1);
            } while (str1.compareTo("stop") != 0);

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода" + exc);
        }
    }
}
