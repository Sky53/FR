package Multithreading;

public class MyThread implements Runnable {
    String thrdName;

    public MyThread(String thrdName) {
        this.thrdName = thrdName;
    }

    @Override
    public void run() {
        System.out.println(thrdName + " - Started(Запуск)");
        try {
            for (int count = 0; count <10; count++){
                Thread.sleep(400);
                System.out.println("in (В) " + thrdName + " count (счтетчик) : " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrdName + " - Прерван");
        }
        System.out.println(thrdName +"completion (Завершение)");
    }
}
class UseTheeads {
    public static void main(String[] args) {
        System.out.println("Зaпycк основного потока");
        // Создаем объект MyThread
       // Javaler.milti.MyThread myThread = new Javaler.milti.MyThread("Child #1");
        MyThread myThread = new MyThread("Count #1");
        //формируем поток на его основе
        Thread thread = new Thread(myThread);
        //выполнение потока
        thread.start();

        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException exc){
                System.out.println("Пpepывaниe основного потока");
            }
        }
        System.out.println("Зaвepmeниe основного потока");
    }
}

