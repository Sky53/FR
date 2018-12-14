package Metod;

class Test {
    /**
     * этот метод не может изменить значение аргументов,
     * передоваемых ему при вызове
     */
    void noChande(int i, int j) {
        i = i + j;
        j = -j;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15;
        int b = 20;

        System.out.println(" a & b перед вызовом: " + a + " " + b);

        ob.noChande(a, b);

        System.out.println(" a & b после вызава: " + a + " " + b);

    }
}
