package input.R_W_Data;

import  java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 12;
        double d = 1254.36;
        boolean b = true;
        //Записать ряд значений
        try(DataOutputStream dataout = new DataOutputStream(new FileOutputStream("test_data"))) {
            System.out.println("Записано: " + i);
            dataout.writeInt(i);

            System.out.println("Записано: " + d);
            dataout.writeDouble(d);

            System.out.println("Записано: " + b);
            dataout.writeBoolean(b);

            System.out.println( "Записано: " + 12.5 * 7.8);
            dataout.writeDouble(12.5 * 7.8);

        }catch (IOException exc) {
            System.out.println("Ошибка при записи");
            return;
        }
        System.out.println();
        //А теперь прочитать записанные значение
        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("test_data"))) {
            i = dataIn.readInt();
            System.out.println("Прочитано: " + i);

            d = dataIn.readDouble();
            System.out.println("Прочитано: " + d);

            b = dataIn.readBoolean();
            System.out.println("Прочитано: " + b);

            d = dataIn.readDouble();
            System.out.println("Прочитано: " + d);

        }catch (IOException exc){
            System.out.println("Ощибка при чтении");

        }

    }
}
