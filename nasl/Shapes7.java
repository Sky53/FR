package nasl;

class TwoDShape7 {
    private double wight7;
    private double height7;

    // Конструктор по усолчанию
    TwoDShape7() {
        wight7 = height7 = 0.0;
    }

    // Параметизированный конструктор
    TwoDShape7(double w7, double h7) {
        wight7 = w7;
        height7 = h7;
    }

    /**
     * Создать объект с одинаковыми значениями
     * переменных экземпляра width & height
     */
    TwoDShape7(double x) {
        wight7 = height7 = x;
    }

    // Создать один объект на основе другого
    TwoDShape7(TwoDShape7 ob) {
        wight7 = ob.wight7;
        height7 = ob.height7;
    }

    // Методы доступа к переменным экземпляра width & height
    double getWight7() {
        return wight7;
    }

    double getHeight7() {
        return height7;
    }

    void setWight7(double w7) {
        wight7 = w7;
    }

    void setHeight7(double h7) {
        height7 = h7;
    }

    void showDim7() {
        System.out.println("Ширина и высота - " + wight7 + " & " + height7);
    }
}

/**
 * Подкласс для предоставления треугольников,
 * производный от класса TwoDShape7
 */
class Triangle7 extends TwoDShape7 {
    private String style7;

    // Конструктор по умолчанию
    Triangle7() {
        super();
        style7 = "none";
    }

    //Конструктор класса Triangle
    Triangle7(String s7, double w7, double h7) {
        super(w7, h7); // вызов конструктора суперкласса
        style7 = s7;
    }

    //Конструктор с одним аргументом для построения треугольника
    Triangle7(double x) {
        super(x);
        style7 = "Закрашенный";
    }

    //Создать один объект на основе другого
    Triangle7(Triangle7 ob) {
        super(ob);
        style7 = ob.style7;
    }

    double area7() {
        return getWight7() * getHeight7() / 2;
    }

    void showStyle7() {
        System.out.println("Треугольник - " + style7);
    }
}

class Shapes7 {
    public static void main(String[] args) {
        Triangle7 t71 = new Triangle7("контурный", 16.0, 24.0);
        Triangle7 t72 = new Triangle7(t71);

        System.out.println("Информация о т71: ");
        t71.showStyle7();
        t71.showDim7();
        System.out.println("Площадь - " + t71.area7());
        System.out.println();

        System.out.println("Информация о т72: ");
        t72.showStyle7();
        t72.showDim7();
        System.out.println("Площадь - " + t72.area7());
        System.out.println();

    }
}
