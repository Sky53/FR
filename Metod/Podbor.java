package Metod;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


class Podbor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        StringBuilder str2 = new StringBuilder();
        for (char c : str1.toCharArray()) {
            str2.append(generateSymbol(c));
        }
        System.out.println(str2.toString());
    }

    private static Character generateSymbol(char character) {
        char newCharacter;
        do {
            newCharacter = (char) (ThreadLocalRandom.current().nextInt());
        }
        while (newCharacter != character);
        return newCharacter;

    }

}
