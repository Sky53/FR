package Metod;

/**
 * Метод с переменным число аргументов
 */
class VarArgs {
    /**
     * Метод VarArgs  допускает переменное число аргументов
     */
    static void  vaTest (String msq, int ... v){
        System.out.println(msq + v.length);
        System.out.println("Contents: ");

        for ( int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("one arg:", 10);
        vaTest("three arg:", 1,2,3);
        vaTest(" no arg");

    }
}
