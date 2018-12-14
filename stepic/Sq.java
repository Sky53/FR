package stepic;

public class Sq {

    public static double sqrt(double x){
        if (x < 0) {
            throw new  IllegalArgumentException("Expected non-negative number, got ?");
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        sqrt(-1.0);
        Math.sqrt(-10);

    }
}
