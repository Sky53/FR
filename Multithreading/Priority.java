package Multithreading;

public class Priority implements Runnable {
    int count;
    Thread thread;

    static boolean stop = false;
    static String currentName;
    /* Создание нового потока. Обратите внимание на то,
        что конструктор не запускает поток на выполнение. */

     Priority (String name) {
         this.thread = new Thread(this, name);
         count = 0;
         currentName = name;
     }
     // Начать выполнение нового потока

    @Override
    public void run() {
        System.out.println(thread.getName() + " - Запуск");
        do {
            count++;

            if (currentName.compareTo(thread.getName()) !=0) {
                currentName = thread.getName();
                System.out.println("В " + currentName);
            }
        }while (stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n" + thread.getName() + " - Завершение");
    }
}

class PriorityDemo {
    public static void main(String[] args) {
        Priority priority1 = new Priority("High Priority");
        Priority priority2 = new Priority("Low Priority");

        // задать приоритеты
        priority1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        priority2.thread.setPriority(Thread.NORM_PRIORITY - 2);

        //запустить потоки на выполнение
        priority1.thread.start();
        priority2.thread.start();

        try {
            priority1.thread.join();
            priority2.thread.join();
        }catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        System.out.println("\nCчeтчик потока High Priority: " +priority1.count);
        System.out.println("\nCчeтчик потока Low Priority: " +priority2.count);
    }
}
