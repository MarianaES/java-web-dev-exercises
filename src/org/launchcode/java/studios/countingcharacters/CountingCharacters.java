package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args) {
        // CountingCharacters countingCharacter = new CountingCharacters();
        HashMap<Character, Integer> letterCount = new HashMap<>();
        CountingCharacters.convertToCharArr(letterCount);
    }

    public static String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." + "" +
            "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
            "Once you’ve done that, it’s pretty straightforward from there.";

    public static void convertToCharArr(HashMap<Character, Integer> letterCount) {
        //quote = quote.replaceAll("[^A-Za-z}", "");
        char[] characterInString = quote.toCharArray();

        for (char letter : characterInString) {
            if (Character.isLetter(letter)) {
                if (!letterCount.containsKey(letter)) {
                    letterCount.put(letter, 1);
                } else {
                    letterCount.put(letter, letterCount.get(letter) + 1);
                }
            }
        }

        for (Map.Entry entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
