package exercises.ch3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        // ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // ArrayListPractice.getSum(numbers);
        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitString();
        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));

        System.out.println("Enter length of the words to search:");
        Integer searchLength = ArrayListPractice.getUserSearchInput();
        ArrayListPractice.getWordsOfLength(wordsToSearch, searchLength);
    }


    public static Integer getUserSearchInput() {
        Scanner input = new Scanner(System.in);
        Integer myUsersInt = input.nextInt();
        input.close();
        return myUsersInt;
    }

//    public static Integer getSum(ArrayList<Integer> numbersToSum) {
//
//        int result = 0;
//
//        for (Integer number: numbersToSum) {
//            if (number % 2 == 0) {
//                result += number;
//            }
//        }
//
//        System.out.println(result);
//        return 0;
//
//    }

    public static void getWordsOfLength(ArrayList<String> wordsList , Integer searchLength) {

        for (String word: wordsList) {
            if (word.length() == searchLength) {
                System.out.println(word);
            }
        }

    }

}
