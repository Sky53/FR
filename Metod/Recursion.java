package Metod;

import java.math.BigDecimal;
import java.math.BigInteger;

class Factorial {

    public  BigDecimal decimal = new BigDecimal(factR(240));
    // рекурсивный метод
    static int  factR(int n) {
        int result;
        if (n == 1) {
            return 1;
        } else {
            result = factR(n - 1) * n;
            return result;
        }

    }
    // итеративный метод
    int facrI(int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++) {
            result *= t;
        }

        return result;
    }

    /**
     *
     * @param n
     * @return factorial n
     */
    public BigInteger factBigInt(int n) {
        BigInteger bigInteger = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }



}


public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Вычисдение рекурсивным методом");
        System.out.println("Факториал 3 равнен " + f.factR(1));
        System.out.println("Факториал 3 равнен " + f.factR(3));
        System.out.println("Факториал 4 равнен " + f.factR(4));
        System.out.println("Факториал 5 равнен " + f.factR(5));
        System.out.println("Факториал 6 равнен " + f.factR(20));

        System.out.println("Вычисление итеративным способом");
        System.out.println("Факториал 3 равнен " + f.facrI(3));
        System.out.println("Факториал 4 равнен " + f.facrI(4));
        System.out.println("Факториал 5 равнен " + f.facrI(5));
        System.out.println("Факториал 6 равнен " + f.facrI(20));

//        System.out.println(new BigDecimal(f.facrI(240)));
        System.out.println();
        System.out.println();
        System.out.println(f.factBigInt(240));
    }
}
