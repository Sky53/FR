package JavaRush;

public class Solution {


    public static void main(String[] args) {
        Cat kirry = new Cat();
        kirry.owner = new Person();
        kirry.owner.name = "HelloKitty";

        print("Java easy to learn!");
        print("Java opens many opportunities!");
    }

    public static void print(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}

class Person {
    String name;
    int age;
}

class Rectangele {
    int x;
    int y;
    int width;
    int height;

}
class Cat {
    Person owner;
    Rectangele territory;
    int age;
    String name;
}

