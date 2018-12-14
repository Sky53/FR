package Multithreading.rePlay;

public class Solution_1 {
    public static void main(String[] args) {
        TestThread_1 thread = new TestThread_1();
        thread.start();
    }

    public static class TestThread_1 extends Thread{
        static {
            System.out.println("it's a static block inside  TestThread" );
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}
