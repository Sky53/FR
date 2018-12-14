package exceptions.queue_9;

public class FixedQueue implements ICharQ {
    private char q[]; // Массив для хранения элементов очереди
    private int putloc9; // Индекс вставки эл очереди
    private int getloc9; // Индекс извлечения эл очереди

    // Создание пустой очереди заданного размера
    public FixedQueue(int size) {
        q = new char[size + 1];
        putloc9 = 0;
        getloc9 = 0;
    }

    // Поместить символы в очередь
    public void put(char ch) throws QueueFullException {
        if (putloc9 == q.length - 1) {
            throw new QueueFullException(q.length - 1);
        }
        putloc9++;
        q[putloc9] = ch;
    }

    // Извлечь символ из очереди
    public char get() throws QueueEmptyException {
        if (getloc9 == putloc9) {
            throw new QueueEmptyException();
        }
        getloc9++;
        return q[getloc9];
}

}
