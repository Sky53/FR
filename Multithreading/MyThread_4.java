package Multithreading;

public class MyThread_4 implements Runnable {
    Thread thread; // in value save link for stream(thread)| В переменной хранится ссылка на поток(нить)

    public MyThread_4(String name) {
        this.thread = new Thread(this, name); // name is assiginned to stream when it is created
        // Имя присваивается потоку при его создании
        thread.start(); // started stream | Старт потока
    }

    @Override // Start implementation new stream (thread)| Начать выполнение новго порока
    public void run() {
        System.out.println(thread.getName() + " - Started(запуск)");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In(В) " + thread.getName() + ", count(счетчик)" + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " - Прерван");
        }
        System.out.println(thread.getName() + " - Завершение");
    }
}
class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread_4 myThread_41 = new MyThread_4("Child #1");
        MyThread_4 myThread_42 = new MyThread_4("Child #2");
        MyThread_4 myThread_43 = new MyThread_4("Child #3");

        try {
            myThread_41.thread.join();
            System.out.println("Child #1 - Присоеденен");
            myThread_42.thread.join();
            System.out.println("Child #2 - Присоеденен");
            myThread_43.thread.join();
            System.out.println("Child #3 - Присоеденен");
        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        System.out.println("Завершение основного потока");
    }
}
