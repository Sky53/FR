package reLern.dz8;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static class Cat {

    }

    public static class Dog {

    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static Set<Dog> createDog() {
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;

    }

    public static Set<Object> removeCats(Set<Object> objects,Set<Cat> cats){
        objects.removeAll(cats);
        return objects;
    }

    public static void print(Set<Object> objects){
        for (Object object : objects){
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
//        System.out.println(cats);
//        System.out.println();
        Set<Dog> dogs = createDog();
//        System.out.println(dogs);
//        System.out.println();
        Set<Object> pets = join(cats,dogs);
//        System.out.println(pets);
//        System.out.println();
        removeCats(pets,cats);
//        System.out.println(pets);
        print(pets);
    }
}
