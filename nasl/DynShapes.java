package nasl;

class TwoDShape8 {
    private double width8;
    private double height8;
    private String name;

    // Конструктор по усолчанию
    TwoDShape8() {
        width8 = height8 = 0.0;
        name = "none";
    }

    //Параметизированный конструктор
    TwoDShape8(double w8, double h8, String n) {
            width8 =w8;
            height8 =h8;
            name = n;
    }
    /**
     * Создать объект с одинаковыми значениями
     * переменных экземпляра Width & Height
     */
    TwoDShape8 (double x, String n) {
        width8 = height8 = x;
        name = n;
    }
    //Создать один объект на основе другог

    TwoDShape8 (TwoDShape8 ob8){
        height8 = ob8.height8;
        width8 = ob8.width8;
        name = ob8.name;
    }
    // Методыы доступа к переменным экземпляра Width & Height
    double getWidth8() {
        return width8;
    }
    double getHeight8() {
        return height8;
    }
    void setWidth8(double w8) {
        width8 = w8;
    }

    void  setHeight8 (double h8){
        height8 = h8;
    }

    String getName8(){
        return name;
    }
    void showDim8() {
        System.out.println("Ширина и Высота + " + height8 + " & " + width8);
    }
    double area8() {
        System.out.println("Метод area8 может быть переорределен");
        return  0.0;
    }
}

/**
 * Подкласс для предоставления треугольников
 * произвольный от класса TwoDShape8
 */
class  Triandle8 extends TwoDShape8{
    private String style8;
    // Конструктор по умолчанию
    Triandle8 (){
        super();
        style8 = "none";
    }
    // Конструктор класса Triangle
    Triandle8(double h8, double w8, String s8) {
        super(w8, h8, "Треугольник");
        style8 = s8;
    }
    /**
     * Конструктор с одним аргументом для построения треугольника
     */
    Triandle8(double x) {
        super(x,"Треугольник");
        style8 = "Очешуительный";
    }
    // Один объек на основе другог
    Triandle8(Triandle8 ob8) {
        super(ob8);
        style8= ob8.style8;
    }
    // Переопределение метода area8() для класса Triangle
    double area8 (){
        return getHeight8() * getWidth8() / 2;
    }
    void showStyle(){
        System.out.println("Треугольник " + style8);
    }
}

/**
 * Подкласс для пердоставления прямоугольников,
 * производный от класса TwoDShape
 */
class Rectangle8 extends TwoDShape8 {
    // Конструктор по умолчанию
    Rectangle8() {
        super();
    }
    // конструктор класса Rectangle
    Rectangle8 (double w8, double h8){
        super(w8,h8,"Прямоугольник"); // Вызвать конструктор суперкласса
    }
    // Создать квадрат
    Rectangle8(double x){
        super(x,"Прямоугольник(квадрат)");
    }
    //создать один объект на основе другог
    Rectangle8 (Rectangle8 ob) {
        super(ob);// передать объект конструтору класса TwoDShape8
    }
    boolean isSquare (){
        if ( getWidth8() == getHeight8()){
            return true;
        }else{
            return false;
        }
    }
    // Переопределение метода area() для класса Rectangle
    double area8 () {
        return  getHeight8() * getWidth8();
    }

}

class DynShapes {
    public static void main(String[] args) {
        TwoDShape8 shapes[] = new TwoDShape8[5];

        shapes[0] = new Triandle8(12.0,16.0,"Ну такой");
        shapes[1] = new Rectangle8(10);
        shapes[2] = new Rectangle8(10,4);
        shapes[3] = new Triandle8(7.5);
        shapes[4] = new TwoDShape8(10,20,"Фигура");

        for (int i = 0; i < shapes.length; i++){
            System.out.println("Объект - " + shapes[i].getName8());
            System.out.println("Площадь - " + shapes[i].area8());
            System.out.println();
        }
    }
}
