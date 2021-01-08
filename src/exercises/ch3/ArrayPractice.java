package exercises.ch3;

//public class ArrayPractice {
//
//    public static void main(String[] args) {
//
//        int[] numbers = new int[]{ 1, 1, 2, 3, 5, 8 };
//
//        // Print all numbers
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        // Print odd numbers
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 != 0) {
//                System.out.println(numbers[i]);
//            }
//        }
//
//        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] words = phrase.split(" ");
//
//        for (String word : words) {
//            System.out.println(word);
//        }
//
//        System.out.println(Arrays.toString(words));
//
//    }
//
//}

// TA approach

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printOddNumbers();
        // arrayPractice.splitString();
    }

    public void printOddNumbers() {

        int[] myArrayOfInts = { 1, 1, 2, 3, 5, 8 };

        for (int i = 0; i < myArrayOfInts.length; i++) {
            if (myArrayOfInts[i] % 2 == 1) {
                System.out.println(myArrayOfInts[i]);
            }
        }
    }

    public String[] splitString() {

        String myProvideString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] mySplitStrings = myProvideString.split(" ");
        // System.out.println(Arrays.toString(mySplitStrings));
        return mySplitStrings;

    }
}