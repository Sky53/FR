package exceptions;

class ThrowsDemo {
    public static char promt(String str)
            throws java.io.IOException {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = promt("Enter a letter");
        }
        catch (java.io.IOException exc) {
            System.out.println("Произошло исключение ввода-вывода");
            ch = 'X';
        }
        System.out.println("Вы нажали клавишу " + ch);
    }
}
