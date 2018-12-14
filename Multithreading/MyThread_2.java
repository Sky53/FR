package Multithreading;

public class MyThread_2 extends Thread {

    //Построить новый поток
    public MyThread_2(String name) {
    super(name);// присвоить потоку умя
    start(); // начать поток
    }

    //начать исполнение новго потока
    public void run() {
        System.out.println(getName() + " starting");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is" + count);
            }
        }
        catch (InterruptedException exc){
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " terminating");
    }
}
class ExtendTherd {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        MyThread_2 myThread_2 = new MyThread_2("Child #1");
        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println(" Main thread interrupted");
            }
        }
        System.out.println("Main thread ending");
    }
}
