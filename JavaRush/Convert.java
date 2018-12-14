package JavaRush;

public class Convert {
    public static void main(String[] args) {
        System.out.println();
        Man man = new Man();
        Woman woman = new Woman();

        man.wife = woman;
        woman.husband = man;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}