package Multithreading;

class SumArray {
    private int sum;

    // Метод sumArray() синхронизирован.
    synchronized int sumArray(int nums[]) {
        sum = 0; // обнулить сумму

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " +
                    Thread.currentThread().getName() +
                    " is " + sum);
            try {
                Thread.sleep(10); // разрешить переключение задач
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread_55 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    // построить новый поток
    MyThread_55(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start(); // начать поток
    }

    // начать исполнение нового потока
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting.");

        answer = sa.sumArray(a);
        System.out.println("Sum for " + thrd.getName() +
                " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}

class Sync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread_55 mtl = new MyThread_55("Child #1", a);
        MyThread_55 mt2 = new MyThread_55("Child #2", a);
    }
}