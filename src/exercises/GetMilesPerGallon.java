package exercises;

import java.util.Scanner;

public class GetMilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of miles:");
        float miles = input.nextFloat();

        System.out.println("Gas consumed (in gallons):");
        float gallons = input.nextFloat();

        float milesPerGallons = miles / gallons;

        System.out.println("Miles per gallon: " + milesPerGallons);
    }
}
