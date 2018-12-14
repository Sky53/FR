package Multithreading;

class MyThread_5 implements Runnable {
    Thread thread;
    MyThread_5() {
        thread = new Thread(this, "Дополнительный поток");
        System.out.println("Создан дополнительный поток " + thread);
        thread.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("\tдополнительный поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("\tдополнительный поток прерван");
        }
        System.out.println("\tдополнительный поток завершён");
    }
}
public class RunnableExample
{
    public static void main(String[] args)
    {
        new MyThread_5();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершён");
    }
}