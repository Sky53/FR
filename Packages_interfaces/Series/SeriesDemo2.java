package Packages_interfaces.Series;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos2 obj = new ByTwos2();

        for ( int i = 0; i < 5; i++){
            System.out.println("Следуещее значение: " + obj.getNext());
            System.out.println("Предыдущее значение: " + obj.getPrevious());
        }
        System.out.println("\nСброс");
        obj.reset();

        for ( int j = 0; j < 5; j++){
            System.out.println("Следуещее значение: " + obj.getNext());
            System.out.println("Предыдущее значение: " + obj.getPrevious());
        }
        System.out.println("\nНачальное значение: 120");
        obj.setStart(120);

        for (int v = 0; v < 5; v++){
            System.out.println("Следуещее значение: " + obj.getNext());
            System.out.println("Предыдущее значение: " + obj.getPrevious());
        }

    }
}

