package nasl;


class TwoDShape6 {
    private double width6;
    private double height6;

    // Конструктор по умолчанию
    TwoDShape6() {
        width6 = height6 = 0.0;
    }

    // Параметризированный конструктор
    TwoDShape6(double w6, double h6) {
        width6 = w6;
        height6 = h6;
    }

    // Конструктор объекта с одинаковыми значаниями
    // переменных экземпляра width & height
    TwoDShape6(double x){
        width6 = height6 = x;
    }
    // Методы доступа к переменным экхемпляра width & height
    double getWidth6(){
        return width6;
    }
    double getHeight6(){
        return height6;
    }

    void setWidth6(double w6){
        width6 = w6;
    }
    void  setHeight6(double h6){
        height6 = h6;
    }

    void  showDim6() {
        System.out.println("Ширина и Высота - " + width6 + " & " + height6);
    }
}

class Triangle6 extends TwoDShape6 {
    private String style6;

    //конструктор по умолчанию
    Triangle6(){
        super(); // вызов конструктора суперкласса по умалчанию
        style6 =  "none";
    }
    // конструктор
    Triangle6 (String s6, double w6, double h6){
        super(w6, h6); // вызов конструктора суперкласса с двумя переменными
        style6 = s6;
    }
    Triangle6(double x) {
        super(x); // вызов конструктора суперкласса с одним аргумантом
        style6 = "Закрашенный";
    }

    double area6() {
        return  getWidth6() * getHeight6() / 2;
    }

    void  showStyle6() {
        System.out.println("Треугольник " + style6);
    }
}

class ColorTriandle extends Triangle6{
    private String color;
    ColorTriandle (String c6, String s6, double w6, double h6){
        super(s6,w6,h6);
        color = c6;
    }
    String getColor(){
        return color;
    }
    void showColor(){
        System.out.println("Цвет - " + color);
    }
}
class Shapes6 {
    public static void main(String[] args) {
        ColorTriandle t61 = new ColorTriandle("Синий", "контурный", 10.5,12.6);
        ColorTriandle t62 = new ColorTriandle("Красный", "закрашеный", 10.5,10.5);

        System.out.println("Информация о т61: ");
        t61.showStyle6();
        t61.showDim6();
        t61.showColor();
        System.out.println("Площадь - " + t61.area6());
        System.out.println();


        System.out.println("Информация о т62: ");
        t62.showStyle6();
        t62.showDim6();
        t62.showColor();
        System.out.println("Площадь - " + t62.area6());
        System.out.println();
    }
}
