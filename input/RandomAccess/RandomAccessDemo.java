package input.RandomAccess;

import javax.imageio.IIOException;
import java.io.*;
public class RandomAccessDemo {
    public static void main(String[] args) {
      double data[] = {17.6 , 88.14, 36.5 , 41.2 , 10.00, 99.99};
      double d;

      //Открыть и использовать файл с произвольным доступом

      try(RandomAccessFile raf = new RandomAccessFile("random.dat","rw")) {
          // запись значения в файл
          for ( int i = 0; i < data.length; i++) {
              raf.writeDouble(data[i]);
          }

          raf.seek(0); // Найти первое значение типа double
          d = raf.readDouble();
          System.out.println("Первое значение: " + d);

          raf.seek(8); // найти второе значение типа double;
          d = raf.readDouble();
          System.out.println("Второе значение: " + d);

          raf.seek(8*3); // найти четвертое значение типа double
          d = raf.readDouble();
          System.out.println("Четвертое значение: " + d);

          System.out.println();

          //Прочитать значение через одно

          System.out.println(" значения с нечетными порядковыми номерами");

          for ( int i = 0; i < data.length; i+=2){
              raf.seek(8 * i); // найти i-е значение типа double
              d = raf.readDouble();

              System.out.print(d + " ");
          }

      }catch (IOException exc){
          System.out.println("Ошибка ввода-вывода");
      }
    }
}
