package Metod;

class MyClass {
    public String x;
    private int alpha; // закрытый доступ
    public int beta; // открытый доступ
    int gamma;

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.setAlpha(-99);
        System.out.println(" ob.alpha: " + ob.getAlpha());

        ob.beta = 88;
        ob.gamma = 99;
    }
}
