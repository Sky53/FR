package exceptions;

class ExcTest {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("До генерации исключения.");

        /**
         * Ссгенерировать исключения в связи с выходом индекса за границы массива
         */
        nums[7] = 99;
        System.out.println("Это строка не будет отображаться");
    }
}

class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        // Перехват исключения
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");
    }
}
