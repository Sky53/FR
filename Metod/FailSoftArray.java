package Metod;

class FailSoftArray {
    private int a[]; // ссыдка на массив
    private int errval; // значения, возвращаемые в случае возникновения ошибки при выполнении метода get ()
    public int lenght; // открытая перемменая

    public FailSoftArray(int size, int errv) { // Конструктору данного класса передается размер массива и значения,
        a = new int[size];                     // которые должен возвращат метод get () при возникновении  ошибки
        errval = errv;
        lenght = size;
    }

    public int get(int index) { // Возвратить значение элемента массива с заданным индоксом
        if (indexOK(index)) {
            return a[index];
        }
        return errval;
    }

    public boolean put(int index, int val) {  // установить значение элементов с заданным индексом.
        if (indexOK(index)) {                 // Если возникает ошибка, возвратить логическое значение false
            a[index] = val;
            return true;
        } else {
            return false;
        }
    }

    private boolean indexOK(int index) {        // Вернуть логическое значение true, если индекс
        if (index >= 0 & index < lenght) {      // не выходит за границы
            return true;
        } else {
            return false;
        }
    }
}

// Демонстрация работы с "отказоустойчивым" массивом
class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;
        System.out.println("Обработка ошибок без вывода отчета."); // Демонстрация корректной обработки ошибок
        for (int i = 0; i < (fs.lenght * 2); i++) {
            fs.put(i, i * 10);
        }
        for (int i = 0; i < (fs.lenght * 2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");

        System.out.println("Обработка ошибок с выводом отчета");
        for (int i = 0; i < (fs.lenght * 2); i++) {
            if (!fs.put(i, i * 10)) {
                System.out.println("Индекс " + i + " вне допустимого диапозона");
            }


        }
        for (int i = 0; i < (fs.lenght * 2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            } else {
                System.out.println("Индекс " + i + " вне допустимого значения");
            }
        }

    }
}
