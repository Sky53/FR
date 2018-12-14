package Multithreading;

public class MyThread_3 implements Runnable {
    Thread thread; // in value save link for stream(thread)| В переменной хранится ссылка на поток(нить)

    public MyThread_3(String name) {
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

class MoreThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Запуск основного потока");
        MyThread_3 myThread_31 = new MyThread_3("Child #1");
        MyThread_3 myThread_32 = new MyThread_3("Child #2");
        myThread_31.thread.join();
        //myThread_32.thread.join();
        MyThread_3 myThread_33 = new MyThread_3("Child #3");
        //myThread_33.thread.join();


        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }while (myThread_31.thread.isAlive() || myThread_32.thread.isAlive() || myThread_33.thread.isAlive());
        System.out.println("завершение основного потока");
    }
}
