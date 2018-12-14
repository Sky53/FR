package reLern.StackTrace;

public class Solo {
    public static void main(String[] args) {
        System.out.println( metod1());
    }
    public static StackTraceElement[] metod1(){
        return metod2();
    }
    public static StackTraceElement[] metod2() {
        return metod3();
    }
    public static StackTraceElement[] metod3() {
        return Thread.currentThread().getStackTrace();
    }
}
