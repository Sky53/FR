package nasl;

/**
 * Использование методов доступа для установки и
 * получения значений закрытых членов
 */
class TwoDShape2 {
    private double width;   // теперь эти переменные
    private double height; //объявлены как закрытые

    // Методы доступа к закрытым переменным экземпляра width и height

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim2() {
        System.out.println("Ширина и Высота - " + width + " и " + height);
    }
}

/**
 * Подкласс для предоставления треугольников,
 * произвольный от класса TwoDShape2
 */
class Triangle2 extends TwoDShape2 {
    String style2;

    double area2() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle2() {
        System.out.println("Треугольник " + style2);
    }
}

class Shapes2 {
    public static void main(String[] args) {
        Triangle2 ob1 = new Triangle2();
        Triangle2 ob2 = new Triangle2();

        ob1.setWidth(4.0);
        ob1.setHeight(4.0);
        ob1.style2 = "Закрашенный политкорректный";

        ob2.setWidth(8.0);
        ob2.setHeight(12.0);
        ob2.style2 = "Неопределенный";

        System.out.println("Информация об об1: ");
        ob1.showStyle2();
        ob1.showDim2();
        System.out.println("Площадь - " + ob1.area2());

        System.out.println();

        System.out.println("Информация об об2: ");
        ob2.showStyle2();
        ob2.showDim2();
        System.out.println("Площадь - " + ob2.area2());
    }
}


