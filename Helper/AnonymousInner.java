package Helper;

abstract class AnonymousInner {
    public abstract void mymethod();
}

 class Outer_class {

    public static void main(String args[]) {
        AnonymousInner inner = new AnonymousInner() {
            public void mymethod() {
                System.out.println("Это пример анонимного внутреннего класса");
            }
        };
        inner.mymethod();
    }
}