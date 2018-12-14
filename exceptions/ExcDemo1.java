package exceptions;

public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {// Создаеться блок Try( В котром отслеживаються ошибки)
            System.out.println("До генерации Исключения");

            nums[10] = 10;
            System.out.println("Эта строка не будет выведена");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");
    }
}
