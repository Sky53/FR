package Packages_interfaces.Series;

public interface Series {
    int getNext(); // Возвратить следущее по порядку число

    void reset();  // Сброс

    void setStart(int x); // Установить начальное значение

    /**
     * Возвратить массив в котором n элементов,
     * располагающихся в ряду вслед за текущим элементос
     */
    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = getNext();
        }
        return vals;
    }
}
