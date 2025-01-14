import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Step 2: Initialize variables to store total marks
        int totalMarks = 0;

        // Step 3: Input marks for each subject
        System.out.println("Enter marks obtained in each subject (out of 100): ");
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Marks for subject " + i + ": ");
            int marks = scanner.nextInt();

            // Validate that marks are between 0 and 100
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid input. Enter marks between 0 and 100: ");
                marks = scanner.nextInt();
            }

            totalMarks += marks; // Add marks to total
        }

        // javaStep 4: Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Step 5: Determine grade based on average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Step 6: Display the results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner to free up resources
        scanner.close();
    }
}