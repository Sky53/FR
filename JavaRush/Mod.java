package JavaRush;

public class Mod {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.who("Tuzik", 5);

        Dog dog1 = new Dog();

        dog1.who("Basya", 12);

        dog1.sayGav();
        dog1.howOld();

        System.out.println();

        dog.sayGav();
        dog.howOld();


//        vet1(1, 2);
//        vet1(1, 1);
//        vet1(2, 1);

    }

    private static void vet1(int a, int b) {
        if (!(a < b)) {
            System.out.println(" b  меньше или рвно а");
        } else {
            System.out.println(" b больше а");
        }
    }

}
class Dog{
    String mame;
    int age;

    public void sayGav(){
        System.out.println( this.mame + " Gav");
    }

    public void who(String name, int age ){
        this.mame = name;
        this.age = age;
    }

    public void howOld() {
        System.out.println( this.mame+ " " + this.age + " Years");
    }

    }


