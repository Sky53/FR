package Javaler;

import java.io.*;

public class Test_2 {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        System.out.println(s.replaceAll(".","*"));
        int k = 10;

         Metod(k);
         Metod(k);
         Metod(k);
         Metod(k);

        System.out.println(k);

    }

    static void Metod(int k)

    {

        k++;

    }

}

