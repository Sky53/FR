package Metod;

class Test1 {
    int x;
    int y;

    Test1(int i, int j) {
        x = i;
        y = j;
    }

    /**
     * Передача объекта методу. Теперь переменные ob.a и ob.b объекта,
     * используемого при вызове, так же будут изменяться.     *
     */
    void change1 (Test1 ob1) {
        ob1.x = ob1.x + ob1.y;
        ob1.y = -ob1.y;
    }
}

public class CallByRef {
    public static void main(String[] args) {
        Test1 ob1 = new Test1(15,20);
        System.out.println(" ob1.x & ob1.y before call " + ob1.x + " " + ob1.y);
        ob1.change1(ob1);
        System.out.println(" ob1.x & ob1.y after call " + ob1.x + " " + ob1.y);
    }
}
