package reLern;

import java.util.ArrayList;

public class ConsoleReader {
     public static ArrayList<ConsoleReader> consoleReaderArrayList = new ArrayList<>();

    public ConsoleReader() {
        ConsoleReader.consoleReaderArrayList.add(this);
    }

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        ConsoleReader consoleReader1 = new ConsoleReader();
        ConsoleReader consoleReader2 = new ConsoleReader();
        ConsoleReader consoleReader3 = new ConsoleReader();
        ConsoleReader consoleReader4 = new ConsoleReader();
        ConsoleReader consoleReader5 = new ConsoleReader();
        ConsoleReader consoleReader6 = new ConsoleReader();
        ConsoleReader consoleReader7 = new ConsoleReader();
        ConsoleReader consoleReader8 = new ConsoleReader();
        ConsoleReader consoleReader9 = new ConsoleReader();

        printCats();

    }

    public static void printCats(){
        for (ConsoleReader string : consoleReaderArrayList) {
            System.out.println(string);
        }
    }
}
