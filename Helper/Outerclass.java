package Helper;

public class Outerclass {
    // Метод экземпляра внешнего класса
    void my_Method() {
        int num = 888;

        // Локальный метод внутреннего класса
        class MethodInner_Demo {
            public void print() {
                System.out.println("Это метод внутреннего класса: " + num);
            }
        } // Конец внутреннего класса

        // Доступ к внутреннему классу
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }

    public static void main(String args[]) {
        Outerclass outer = new Outerclass();
        outer.my_Method();
    }
}