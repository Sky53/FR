package Javaler;

public class Myclass {
    int summ;
    double summa;

    public static void main(String[] args) {

            done:

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        System.out.println(k + " ");
                        if (k == 5) break done;
                    }
                    System.out.println("После цикла по К");
                }
                System.out.println("После цикла по J");
            }
            System.out.println("После цкла по i");

        }
    }
