package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();

        System.out.println("Before:" + "\n");
        for (Flavor flavor : flavors) {
            // System.out.println(flavor.getName());
            System.out.println(flavor.getAllergens());
        }
        flavors.sort(comparator);

        System.out.println("\n" + "After:" + "\n");
        for (Flavor flavor : flavors) {
            // System.out.println(flavor.getName());
            System.out.println(flavor.getAllergens());
        }

        // Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        Comparator comparator1 = new ConeComparator();

        System.out.println("Before:" + "\n");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
        cones.sort(comparator1);

        System.out.println("\n" + "After:" + "\n");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

    }
}
