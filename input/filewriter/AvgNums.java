package input.filewriter;
import java.io.*;
/* Данная программа находит среднее арифметическое для
ряда чисел, введенных пользователем с клавиатуры. */
class AvgNums {
    public static void main(String[] args) throws IOException {
        // Создать объект типа BufferedReader,
        // использующий поток ввода System.in
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String str3;
        int n;
        double sum = 0.0;
        double avg;
        double t;

        System.out.println("Сколько чисел вы введете: ");
        str3 = br3.readLine();
        try {
            n = Integer.parseInt(str3);
        }catch (NumberFormatException exc){
            System.out.println("Неверный формат");
            n = 0;
        }
        System.out.println("Ввод " + n + " значений");
        for ( int i = 0; i < n; i++) {
            str3 = br3.readLine();
            System.out.print("; ");
            try {
                t = Double.parseDouble(str3);
            }catch (NumberFormatException exc) {
                System.out.println("неверный фомат");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Среднее значение: " + avg);
    }
}
