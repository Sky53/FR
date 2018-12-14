package JavaRush;

class Cat_1{
    String name;

    public boolean equals(Cat_1 cat){
       return this.name == cat.name;
    }

    public static void main(String[] args) {
        Cat_1 cat = new Cat_1();
        cat.name = "Vasya";
        Cat_1 cat1 = new Cat_1();
        cat1.name = "Vasya";

        System.out.println( cat.equals(cat1));
    }
}

public class equols_1 {



}
