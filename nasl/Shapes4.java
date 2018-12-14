package nasl;

class TwoDShape4 {
    private double width4;
    private double height4;

    //Параметизированный конструктор

    TwoDShape4(double w4, double h4) {
        width4 = w4;
        height4 = h4;
    }
    // Методы доступа к переменным экземплярам width & height

    double getWidth4() {
        return width4;
    }

    double getHeight4() {
        return height4;
    }

    void setWidth4(double w4) {
        width4 = w4;
    }

    void setHeight4(double h4) {
        height4 = h4;
    }

    void showDim4() {
        System.out.println("Ширина и Высота - " + width4 + "  &  " + height4);
    }
}

/**
 * Подкласс для предоставления треугольников,
 * производный от класса TwoDShape4
 */

class Triangle4 extends TwoDShape4 {
    private String style4;

    Triangle4(String s4, double w4, double h4){
        super(w4,h4); // Вызов конструтора суперкласса
        style4 = s4;
    }

    double area4(){
        return getWidth4() * getHeight4() / 2;
    }

    void showStyle4() {
        System.out.println(" Треугольник " + style4);
    }
}
class Shapes4 {
    public static void main(String[] args) {
        Triangle4 t41 = new Triangle4("Великолепный",5.0,6.0);
        Triangle4 t42 = new Triangle4("Вах каакой треугольник, мамой клянусь такой же хочу!!! ВАХ ВАХ",10.5,24.7);

        System.out.println("Инфрмация о т41");
        t41.showStyle4();
        t41.showDim4();
        System.out.println("Площадь - " + t41.area4());
        System.out.println();
        System.out.println("Инфрмация о т42");
        t42.showStyle4();
        t42.showDim4();
        System.out.println("Площадь - " + t42.area4());
    }
}
