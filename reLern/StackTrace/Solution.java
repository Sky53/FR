package reLern.StackTrace;

public class Solution {
    public static void main(String[] args) {
         metod_1();
    }

    public static StackTraceElement[] metod_1() {
        metod_2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement1 : stackTraceElements){
            System.out.println(stackTraceElement1.getMethodName());
        }

        return stackTraceElements;
    }

    public static StackTraceElement[] metod_2() {
        metod_3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement1 : stackTraceElements){
            System.out.println(stackTraceElement1.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] metod_3() {
        metod_4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement1 : stackTraceElements){
            System.out.println(stackTraceElement1.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] metod_4() {
        metod_5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement1 : stackTraceElements){
            System.out.println(stackTraceElement1.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] metod_5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement1 : stackTraceElements){
            System.out.println(stackTraceElement1.getMethodName());
        }
        return stackTraceElements;
    }
}
