package nasl;

class TwoDShape5 {
    private double width5;
    private double height5;

    // Конструктор по умолчанию
    TwoDShape5() {
        this.height5 = height5 = 0.0;
    }

    // Параметризированный конструктор
    TwoDShape5(double w5, double h5) {
        width5 = w5;
        height5 = h5;
    }

    // Конструктор объекта с одинаковыми значаниями
    // переменных экземпляра width & height
    TwoDShape5(double x){
       this.width5 = height5 = x;
    }
    // Методы доступа к переменным экхемпляра width & height
    double getWidth5(){
        return width5;
    }
    double getHeight5(){
        return height5;
    }

    void setWidth5(double w5){
        width5 = w5;
    }
    void  setHeight5(double h5){
        height5 = h5;
    }

    void  showDim5() {
        System.out.println("Ширина и Высота - " + width5 + " & " + height5);
    }
}

class Triangle5 extends TwoDShape5 {
    private String style5;

    //конструктор по умолчанию
    Triangle5(){
        super(); // вызов конструктора суперкласса по умалчанию
        style5 =  "none";
    }
    // конструктор
    Triangle5 (String s5, double w5, double h5){
        super(w5, h5); // вызов конструктора суперкласса с двумя переменными
        style5 = s5;
    }
    Triangle5(double x) {
        super(x); // вызов конструктора суперкласса с одним аргумантом
        style5 = "Закрашенный";
    }

    double area5() {
        return  getWidth5() * getHeight5() / 2;
    }

    void  showStyle5() {
        System.out.println("Треугольник " + style5);
    }
}
class Shapes5 {
    public static void main(String[] args) {
        Triangle5 t51 = new Triangle5();
        Triangle5 t52 = new Triangle5("Контурный",12.0,22.0);
        Triangle5 t53 = new Triangle5(4.0);

        t51 = t52;

        System.out.println("Инфрмация о т51");
        t51.showStyle5();
        t51.showDim5();
        System.out.println("Площадь - " + t51.area5());
        System.out.println();

        System.out.println("Инфрмация о т52");
        t52.showStyle5();
        t52.showDim5();
        System.out.println("Площадь - " + t52.area5());
        System.out.println();

        System.out.println("Инфрмация о т53");
        t53.showStyle5();
        t53.showDim5();
        System.out.println("Площадь - " + t53.area5());
        System.out.println();
    }
}

