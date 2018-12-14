package Metod;

class Overload {
    void ovlDemo() {
        System.out.println("Без параметров");
    }

    /**
     * Перегрузка метода ovlDemo для одного параметра типа int
     */
    void ovlDemo(int a) {
        System.out.println("Один параметр: " + a);
    }

    /**
     * Перегрузка метода ovlDemo для двух параметров типа int
     */
    int ovlDemo(int a, int b) {
        System.out.println("Два параметра: " + a + " " + b);
        return a + b;
    }

    /**
     * Перегрзка метода ovlDemo для двух параметров типа double
     */
    double ovlDemo(double a, double b) {
        System.out.println("Два парамтра типа double " + a + " " + b);
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI = 0;
        double resD = 0;

        /**
         * Поочередно вызываем все версии метода   ovlDemo
         */
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI= ob.ovlDemo(4, 6);
        System.out.println("Результат вызова ob.ovlDemo(4,6): " + resI);
        System.out.println();

        resD= ob.ovlDemo(1.1, 2.32);
        System.out.println("результат вызова ob.ovlDemo(1.1, 2.32)" + resD);
    }
}
