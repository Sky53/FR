package Packages_interfaces.Series;

public class SeriesDemo3 {
    public static void main(String[] args) {
        ByTwos obj1 = new ByTwos();
        ByTwos2 obj2= new ByTwos2();
        Series ob;

        for ( int b = 0; b < 5; b++){
            ob = obj1;
            System.out.println("Следущее значение ByTrow: " + ob.getNext());
            ob = obj2;
            System.out.println("Следущее значение ByTrow2: " + ob.getNext());
        }
    }
}
