package Packages_interfaces.Series;

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos obj = new ByTwos();

        for ( int i = 0; i < 5; i++){
            System.out.println("Следуещее значение: " + obj.getNext());
        }
        System.out.println("\nСброс");
        obj.reset();

        for ( int j = 0; j < 5; j++){
            System.out.println("Следуещее значение: " + obj.getNext());
        }
        System.out.println("\nНачальное значение: 100");
        obj.setStart(100);

        for (int v = 0; v < 5; v++){
            System.out.println("Следуещее значение: " + obj.getNext());
        }

    }
}
