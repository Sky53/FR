package Packages_interfaces.queue;

/**
 * Кольцевая очередь
 */
class CircularQueue implements ICharQ {
    private char q[]; // массив для хранения элементов очереди
    private int putloc; // Индекс вставляемых элементов
    private int getloc; // Индекс извлекаемых элементов

    /**
     * Создать пустую очередь заданного размера
     */
    public CircularQueue(int size) {
        q = new char[size + 1]; // выделить память из очереди
        putloc = getloc = 0;
    }

    /**
     * Поместить символ в очередь
     */
    @Override
    public void put(char ch) {
        /**
         * Очередь считается полной, если индекс putloс на единицу
         * меньше индекса getloc или если индекс putloс указывает на конец массива,
         * а индекс getloc - на его начало
         */
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return ;
        }
        putloc++;
        if (putloc == q.length)  putloc = 0; // перейти в начало массива
        q[putloc] = ch;
    }

    /**
     * Извлечь символ из очереди
     */
    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }
}
