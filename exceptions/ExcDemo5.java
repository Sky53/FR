package exceptions;

public class ExcDemo5 {
    public static void main(String[] args) {
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512, 1024,2048,4096};
        int denom[] = {2, 0, 4, 0, 0, 8, 16, 0, 32};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            }
            catch (ArithmeticException exc){
                System.out.println("Попытка деления на нуль!");
            }
            catch (Throwable exc){
                System.out.println("возникло исключение");
            }
        }
    }
}


