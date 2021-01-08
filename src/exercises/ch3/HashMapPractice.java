package exercises.ch3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;

        System.out.println("Enter your students' ID (or ENTER to finish):");

        do {

            System.out.println("Student ID: ");
            newStudentId = input.nextInt();

            input.nextLine();

            if (!newStudentId.equals(-1)) {
                System.out.println("Student Name: ");
                String newStudentName = input.nextLine();
                students.put(newStudentId, newStudentName);
            }

        } while (!newStudentId.equals(-1));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }

    }
}
