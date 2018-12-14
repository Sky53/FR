package exceptions;

class UseFinally {
    public static void genExeption4(int what) {
        int t;
        int nums4[] = new int[2];
        System.out.println("Получено: " + what);

        try {
            switch (what) {
                case 0:
                    t = 10 / what; // Сгенерировать ошибку деления на ноль
                    break;
                case 1:
                    nums4[4] = 4; // Сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return;// возвратиться из блока try
            }
        }
        catch (ArithmeticException exc4) {
            // перехват исключения
            System.out.println("Попытка деления на ноль");
            return;// вернуться из блока catch
        }
        catch (ArrayIndexOutOfBoundsException exc4) {
            // перехват исключения
            System.out.println("Соответсвующий элемент не найден");
        }
        finally {
            System.out.println("Выход из блока try");
        }
    }
}

class FinallyDemo {
    public static void main(String[] args) {
        for ( int i = 0 ; i < 4; i ++){
            UseFinally.genExeption4(i);
            System.out.println();
        }
    }
}
