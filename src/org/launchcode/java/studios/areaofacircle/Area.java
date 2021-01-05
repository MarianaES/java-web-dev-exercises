package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        Area area = new Area();
        area.calculateArea();
    }
    // Declare class variables here

    // Create Constructors here
    public Area() { }

    // Create other methods here
    public void calculateArea() {
        // Ask for the radius
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        try {
            boolean isPossibleToCalculate = false;
            while(!isPossibleToCalculate) {
                boolean isNumber = input.hasNextDouble();
                double radius = input.nextDouble();
                // Checks if input is a negative number
                if (radius < 0 || !isNumber) {
                    System.out.println("Radius can not be a negative number, enter a valid value: ");
                } else {
                    // Calculate the area
                    double circleArea = Circle.getArea(radius); // The method is static so you can access it without an instance.

                    //Print the result
                    System.out.println("The area of a circle of radius " + radius + " is: " + circleArea);

                    isPossibleToCalculate = true;
                }
            }
        } catch(Exception error) {
            System.out.println("That's not a numeric value!");
            calculateArea();
        }

        // Close the scanner
        input.close();
    }
}



//public class Area {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
//
//        boolean isNumber = input.hasNextDouble();
//
//
//        while (!isNumber) {
//            System.out.println("That's not a valid number, enter a valid radius:");
//            input.next();
//            isNumber = input.hasNextDouble();
//        }
//
//        double radius = input.nextDouble();
//
//        while (radius < 0) {
//            System.out.println("That's not a valid number, enter a valid radius:");
//            input.next();
//            radius = input.nextDouble();
//        }
//
//        double circleArea = Circle.getArea(radius);
//        System.out.println("The area of a circle of radius " + radius + " is: " + circleArea);
//
//    }
//}

//////

