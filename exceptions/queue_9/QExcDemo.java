package exceptions.queue_9;

class QExcDemo {
    public static void main(String[] args) {
        FixedQueue queue = new FixedQueue(10);
        char ch;
        int i;

        try {
            // Переполнение очереди
            for ( i = 0; i < 11; i++){
                System.out.print("Попытка сохранения: " + (char) ('A' + i));
                queue.put((char)('A'+i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        try {
            //Попытка извлечь символ из пустой очереди
            for (i = 0; i < 11; i++){
                System.out.print("Получение очередного символа: ");
                ch = queue.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
