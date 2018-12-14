package Multithreading;

public class MyThread_1 implements Runnable {
    Thread thread; // in value save link for stream(thread)| В переменной хранится ссылка на поток(нить)

    public MyThread_1(String name) {
        this.thread = new Thread(this, name); // name is assiginned to stream when it is created
        // Имя присваивается потоку при его создании
        thread.start(); // started stream | Старт потока
    }

    @Override // Start implementation new stream (thread)| Начать выполнение новго порока
    public void run() {
        System.out.println(thread.getName() + " - Started(запуск)");
        try {
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In(В) " + thread.getName() + ", count(счетчик)" + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thread.getName() + " - Прерван");
        }
        System.out.println(thread.getName() + " - Завершение");
    }
}
class UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread_1 myThread_1 = new MyThread_1("Child #1");
        MyThread_1 myThread_2 = new MyThread_1("Child #2");
        MyThread_1 myThread_3 = new MyThread_1("Child #3");

        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}