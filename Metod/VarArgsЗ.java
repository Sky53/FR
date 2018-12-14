package Metod;

class VarArgsЗ {
    static void vaTest3(int... x) {
        System.out.println("vaTest(int...): " + "Number of args: " + x.length);
        System.out.println("Contents: ");

        for (int i = 0; i < x.length; i++) {
            System.out.println(" arg " + i + ": " + x[i]);
        }
        System.out.println();
    }

    static void vaTest3(boolean... x) {
        System.out.println("vaTest(boolean...): " + "Number of args: " + x.length);
        System.out.println("Contents: ");

        for (int i = 0; i < x.length; i++) {
            System.out.println(" arg " + i + ": " + x[i]);
        }
        System.out.println();
    }

    static void vaTest3(String msq3, int... x) {
        System.out.println("vaTest(String, int...): " + msq3 + x.length);
        System.out.println("Contents: ");

        for (int i = 0; i < x.length; i++) {
            System.out.println(" arg " + i + ": " + x[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        vaTest3(1, 2, 3);
        vaTest3("Testing: ", 10, 20);
        vaTest3(true, false, false);
    }

}

