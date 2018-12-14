package exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 88;
        int b = 0;
        int result;

        char chrs[] = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0) {
                    result = a/b;// Сгенерировать исключение ArithmeticException
                }else {
                    chrs[5] = 'X';// Сгенерировать исключение ArrayIndexOutOfBoundsException
                }
            }
            /**
             * В этом операторе catch организуется перехват обоих исключений
             */
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Перехвачено исключение: " + e);
            }
        }
        System.out.println("После группового перехвата исключений");
    }
}
