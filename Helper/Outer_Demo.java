package Helper;

//class Outer_Demo {
//    int num;
//
//    // Внутренний класс
//    private class Inner_Demo {
//        public void print() {
//            System.out.println("Это внутренний класс");
//        }
//    }
//
//    // Доступ к внутреннему классу из метода
//    void display_Inner() {
//        Inner_Demo inner = new Inner_Demo();
//        inner.print();
//    }
//}
//
//class My_class {
//
//    public static void main(String args[]) {
//        // Создание внешнего класса
//        Outer_Demo outer = new Outer_Demo();
//
//        // Доступ к методу display_Inner()
//        outer.display_Inner();
//
////        Outer_Demo.Inner_Demo inner_demo = outer.new Inner_Demo();
//    }
//}
class Outer_Demo {
    // Частная переменная внешнего класса
    private int num = 2018;

    // Внутренний класс
    public class Inner_Demo {
        public int getNum() {
            System.out.println("Это метод getnum внутреннего класса");
            return num;
        }
    }
}

 class My_class2 {

    public static void main(String args[]) {
        // Создание внешнего класса
        Outer_Demo outer = new Outer_Demo();

        // Создание внутреннего класса
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}