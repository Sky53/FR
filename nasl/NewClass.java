package nasl;

public class NewClass {
    public int test() {
        int a, b, c;
        a = 3;
        b = 5;
        c = a + b;
        return c;
    }


    public static void main(String[] args) {
        int t;
        t = 23;
        double d;
        d = 10.10;
        //t = new
        NewClass first = new NewClass();
        t = first.test();
        System.out.println(t + d);
    }
}