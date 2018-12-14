package exceptions;

public class ExcTypeMismatch {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("До генерации");
            nums[9] = 10;
            System.out.println("Строка не будет отображаться");

        }
        catch (ArithmeticException exc) {
            System.out.println("Выход за границы Массива");
        }
        System.out.println("После оператора catch");
    }
}
