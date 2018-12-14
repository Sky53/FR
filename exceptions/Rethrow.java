package exceptions;

class Rethrow {
    public static void genExeption2() {
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};
        int denom[] = {2, 0, 4, 0, 0, 8, 16, 0, 32};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Попытка деления на нуль!");

            }
            catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Соответвующий элемент не найден");
                throw exc;
            }
        }
    }
}
class  RethowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genExeption2();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // Повторно перехватить исключения
            System.out.println(" Фатальная Ошибка -  стоп машина");
        }
    }
}
/**
 * В данной программе ошибка деления на нуль обрабатывается локально в методе
 * genException (), а при попытке обращения за границы массива исключение генерируется
 * повторно. На этот раз оно перехватывается в методе main (}.
 */
