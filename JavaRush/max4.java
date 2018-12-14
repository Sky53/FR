package JavaRush;

public class max4 {
    public static void main(String[] args) {

        System.out.println(max(1,2,3,4));
        System.out.println(max(1,1,1,1));
        System.out.println(max(1,1,1,1));
        System.out.println(max(4,3,2,1));
        System.out.println(max(3,4,2,1));
        System.out.println(max(3,4,1,2));
        System.out.println(max(4,2,1,3));

    }

    public static int max(int a, int b ){
        if (!(a > b)) {
            return b;
        } else {
            return a;
        }
    }
    public static int max(int a, int b, int c, int d){
        return max(max(a,b),max(c,d));
    }
}
