package Packages_interfaces.queue;


public class IQDemo {
    public static void IQboild(ICharQ queue){

        int size = 10;
        for (int i = 0; i < size; i++) {
            queue.put((char) ('A' + i));
        }

        System.out.println("Содержимое фиксированой очереди: " + queue.getClass().getSimpleName());
        for (int i = 0; i < size; i++) {

            System.out.print(queue.get());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        IQboild(q1);
        IQboild(q2);
        IQboild(q3);



      }
    }

