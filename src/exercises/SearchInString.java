package exercises;

import java.util.Locale;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a word to search for:");
        String word = input.nextLine().toLowerCase(Locale.ROOT);

        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'".toLowerCase(Locale.ROOT);

        boolean includesWord = paragraph.contains(word);
        int index = paragraph.indexOf(word);


        System.out.println("The paragraph includes " + word + " ? " + includesWord);

        if (includesWord) {
            System.out.println("The word index is: " + index);
            System.out.println("The word length is: " + word.length());

            String newParagraph = paragraph.replace((word + " "), "");

            System.out.println(newParagraph);
        }

    }
}
