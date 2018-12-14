package exceptions;

class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Результат операции " + n + " / " + d + " не являеться целым числом";
    }
}

class CustomExceptDemo {
    public static void main(String[] args) {
        // В Массиве numer содержаться нечетные числа
        int numer[] = {4, 8, 16, 33, 64, 112, 113, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        for (int x = 0; x < numer.length; x++) {
            try {
                if ((numer[x] % 2) != 0) {
                    throw new NonIntResultException(numer[x], denom[x]);
                }
                System.out.println(numer[x] + " / " + denom[x] + " = " + numer[x] / denom[x]);
            } catch (ArithmeticException exc) {
                System.out.println("Попытка деления на нуль");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответсвующий элемент не найден");
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
