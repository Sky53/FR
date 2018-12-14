package Metod;

class Queue {
    private char q[]; // массив для хранения элементов очереди
    private  int putloc, getloc; // индексы для  вставки и извлечения элементов очереди

    Queue (int size){
        q = new char[size+1];  // выделить память для очереди
        putloc = 0;
        getloc = 0;
    }

    /**
     * Сконструировать очередь на основе имеющего объекта Queue
     */
    Queue (Queue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Копировать элементы в очередь
        for ( int i = getloc +1; i <= putloc; i++){
            q[i] = ob.q[i];
        }
    }

    /**
     * Сконструировать очередь на основе массива исходных значений
     */
    Queue (char a[]){
        putloc = 0;
        getloc = 0;
        q = new char[a.length +1];

        for (int i = 0; i < a.length; i++){
            put(a[i]);
        }
    }
// поместить символ в очередь
    void put (char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена.");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    // извлечь символы из очереди
    char get() {
        if (getloc==putloc){
            System.out.println( " - Очередь пуста");
            return  (char) 0;
        }
        getloc++;
        return  q[getloc];
    }
}
class QDemo1 {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;


        System.out.println("Использование очереди bigQ для сохранения алфавита");
        for (int i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i)); // поместить буквенный символы в очеред bigQ
            //извлечь буквенные символы из очереди bigQ и отобразить
        }
        System.out.print("Содержимое очереди bigQ: ");

        for (int k = 0; k < 26; k++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);

        }
        System.out.println("\n");
        System.out.println(" Использование очереди smallQ для генерации ошибок");
        for (int j = 0; j < 5; j++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - j));
            smallQ.put((char) ('Z' - j));
            System.out.println();
        }
        System.out.println();
        // Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");
        for (int v = 0; v < 5; v++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }


}

