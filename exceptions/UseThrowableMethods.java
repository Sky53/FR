package exceptions;

class ExcTest3 {
    static void genException3() {
        int nums2[] = new int[4];
        System.out.println("До генерации исключения");

        /**
         * Сгенерировать исключения в свзи с выходом из массива
         */
        nums2[9] = 10;
        System.out.println("Это строка не будет отображаться");
    }
}

class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest3.genException3();
        } catch (ArrayIndexOutOfBoundsException exc3) {
            // Перехватить исключение
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc3);
            System.out.println("\nСтек вызов: ");
            exc3.printStackTrace();
        }
        System.out.println("После оператора catch");
    }
}
