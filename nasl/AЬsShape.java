package nasl;

abstract class TwoDShape9 {
    private double width9;
    private double height9;
    private String name9;

    // Конструктор по умолчанию
    TwoDShape9() {
        width9 = height9 = 0.0;
        name9 = "none";
    }

    // Параметизированый конструктор
    TwoDShape9(double w9, double h9, String n9) {
        width9 = w9;
        height9 = h9;
        name9 = n9;
    }

    /**
     * Создать объект с одинаковыми значениями параметра Width9 & height9
     */
    TwoDShape9(double x9, String n9) {
        width9 = height9 = x9;
        name9 = n9;
    }

    /**
     * Создать один объект на основе другого
     */
    TwoDShape9(TwoDShape9 ob9) {
        width9 = ob9.width9;
        height9 = ob9.height9;
        name9 = ob9.name9;
    }

    /**
     * Параметры доступа к переменным width9 & height9
     */
    double getWidth9() {
        return width9;
    }

    void setWidth9(double w9) {
        width9 = w9;
    }

    double getHeight9() {
        return height9;
    }

    void setHeight9(double h9) {
        height9 = h9;
    }

    String getName9() {
        return name9;
    }

    void setName9(String n9) {
        name9 = n9;
    }

    void showDim() {
        System.out.println("Ширина и Высота - " + width9 + " & " + height9);
    }

    /**
     * Теперь метод area9() обстрактный
     */
    abstract double area9();
}

/**
 * Подкласс для предоставления треугольиков
 * производный от класса TwoDShape9
 */
class Triangle9 extends TwoDShape9 {
    private String style9;

    /**
     * Конструктор по умолчанию
     */
    Triangle9() {
        super();
        style9 = "None";
    }

    /**
     * Конструктор класса Triangle9
     */
    Triangle9(String s9, double w9, double h9) {
        super(w9, h9, "Треугольник");
        style9 = s9;
    }

    /**
     * Конструктор с одим  аргументом для построения треугольника
     */
    Triangle9(double x9) {
        super(x9, "Треугольник");// Вызвать конструктор суперкласса
        style9 = "Закрашеный";
    }

    /**
     * Создать один объект на основе другог
     */
    Triangle9(Triangle9 ob9) {
        super(ob9);// Передать объект конструктору класса TwoDShape9
        style9 = ob9.style9;
    }

    double area9() {
        return getWidth9() * getHeight9() / 2;
    }

    void showStyle9() {
        System.out.println("Треугольник - " + style9);
    }
    /**
     * Подкласс для предоставления прямоугольников,
     * произведенных от класса TwoDShape9
     */
}

class Rectangle9 extends TwoDShape9 {
    /**
     * Конструктор по умолчанию
     */
    Rectangle9() {
        super();
    }

    /**
     * Конструктор класса Rectangle9
     */
    Rectangle9(double w9, double h9) {
        super(w9, h9, "Прямоугольник"); // Вызвать конструктор супер класса
    }

    /**
     * Создать Квадрат
     */
    Rectangle9(double x9) {
        super(x9, "Прямоугольник(Квадрат)");// вызывать конструктор суперкласса
    }

    /**
     * Один на основе другого
     */
    Rectangle9(Rectangle9 ob9) {
        super(ob9);// Передать объект конструктору класса TwoDShape
    }

    boolean isSquare9() {
        if (getWidth9() == getHeight9()) {
            return true;
        } else {
            return false;
        }
    }

    double area9() {
        return getWidth9() * getHeight9();
    }
}

public class AЬsShape {
    public static void main(String[] args) {
        TwoDShape9 shapes9[] = new TwoDShape9[4];
        shapes9[0] = new Triangle9("Красивый",12.3,4.5);
        shapes9[1] = new Rectangle9(10);
        shapes9[2] = new Rectangle9(6,9);
        shapes9[3] = new Triangle9(7.0);

        for (int i = 0; i < shapes9.length; i++){
            System.out.println("Объект - " + shapes9[i].getName9());
            System.out.println("Площадь - " + shapes9[i].area9());
            System.out.println();
        }
    }
}
