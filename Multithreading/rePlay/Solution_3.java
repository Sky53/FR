package Multithreading.rePlay;

public class Solution_3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new SprcialThread_1());
        System.out.println("*****************");
        thread.start();


    }
    public static class SprcialThread_1 implements Runnable{
        @Override
        public void run() {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for (StackTraceElement stackTreca : stackTraceElements){
                System.out.println(stackTreca);
            }
        }
    }
}
