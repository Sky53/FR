package JavaRush;

class Cow {
    public void printAll(){
        printColor();
        printName();
    }
    public void printColor(){
        System.out.println("Я - белая");
    }
    public void printName(){
        System.out.println("я - корова");
    }

}
class Whale extends Cow {
    public void printName() {
        System.out.println("Я - кит");
    }
    public void printColor(){
        System.out.println("я - белый");
    }

    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.printColor();
        whale.printName();
        System.out.println();
        System.out.println();
        Cow cow = new Cow();
        cow.printColor();
        cow.printName();
        System.out.println();
        System.out.println();
        Cow cow1 = new Whale();
        cow1.printColor();
        cow1.printName();
    }
}


