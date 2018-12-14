package Packages_interfaces.queue;

/**
 * Класс, реализующий очередь фиксированого размера
 * для хранения символов
 */
class FixedQueue implements ICharQ{
    private char q[]; // массив для хранения элементов очереди
    private int putloc; // Индекс вставляемых элементов
    private int getloc; // Индекс извлекаемых элементов

    /**
     * Создать пустую очередь заданного размера
     *
     * @param size
     */
    public FixedQueue(int size) {
        q = new char[size + 1];// выделить память для очереди
        putloc = getloc = 0;
    }

    /**
     * Поместить символы ы очередь
     */
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнина");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    /**
     * Извлечь символы из очереди
     */
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
