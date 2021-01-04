package exercises;

import java.util.Scanner;

public class GetRectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length of the rectangle:");
        int length = input.nextInt();

        System.out.println("Width of the rectangle:");
        int width = input.nextInt();

        int rectangleArea = length * width;

        System.out.println("The area of the rectangle is: " + rectangleArea);

    }
}
