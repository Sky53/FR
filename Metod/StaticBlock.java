package Metod;

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Внутри статического блока");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(4.0);
    }
    StaticBlock (String msq2){
        System.out.println(msq2);
    }
}
class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Внутри контейнера");
        System.out.println("sqrt 2 " + StaticBlock.rootOf2);
        System.out.println("sqrt 4 " + StaticBlock.rootOf3);
    }
}
