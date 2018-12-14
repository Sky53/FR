package reLern;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat){
        boolean result = ((this.age * this.strength) / this.weight) > ((anotherCat.age * anotherCat.strength) / anotherCat.weight);
        return result;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("kotVasy",5,5,10);
        Cat cat2 = new Cat("kotBoros",5,10,10);

        cat1.setStrength(1);

        System.out.println(cat1.fight(cat2));
    }
}
