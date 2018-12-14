package nasl;
class TwoDShape3 {
    private double width;
    private double height; //закрытые переменные

    //методы доступа к переменным экземпляра width & height

    double getWidth3() {
        return  width;
    }
    double getHeight3() {
        return height;
    }

    void setWidth3(double w) {
        width = w;
    }

    void  setHeight3(double h){
        height = h;
    }

    void showDim3() {
        System.out.println("Ширина и Высота -" + width + " И " + height);
    }
}

/**
 * Подкласс для предоставления треугольников,
 * производный от класса TwoDShape3
 */

class Triangle3 extends TwoDShape3 {
    private String style3;

    //Конструктор
    Triangle3(String s, double w, double h) {
        setWidth3(w);
        setHeight3(h);

        style3 = s;
    }

    double area3(){
        return getWidth3() * getHeight3() / 2;
    }
    void showStyle3(){
        System.out.println("Треугольник " + style3);
    }
}
class ShapesЗ {
    public static void main(String[] args) {
       Triangle3 tr1 = new Triangle3("Превосходный",4.0,4.0);
       Triangle3 tr2 = new Triangle3("Косячный",15.0,20.0);

        System.out.println("Инфрмация о тр1");
        tr1.showStyle3();
        tr1.showDim3();
        System.out.println("Площадь - " + tr1.area3());
        System.out.println();

        System.out.println();

        System.out.println("Инфрмация о тр2");
        tr2.showStyle3();
        tr2.showDim3();
        System.out.println("Площадь - " + tr2.area3());
    }
}
