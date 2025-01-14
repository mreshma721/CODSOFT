[7:56 pm, 14/1/2025] Reshma: // Importing necessary libraries for user input and random number generation
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        // Random object for generating numbers
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true; // To control whether the user wants to play multiple rounds
        int roundsPlayed = 0;    // Track number of rounds played
        int totalScore = 0;      // Accumulate score across rounds

        // Main loop to play multiple rounds
        while (playAgain) {
            System.out.println("\nStarting a new round!");

            // Generate a random number between 1 and 100
            int generatedNumber = random.nextInt(100) + 1;
            int maxAttempts = 7; // Maximum number of attempts allowed
            int attempts = 0;    // Track the number of attempts taken in the current round
            int roundScore = 0;  // Track score for the current round
            boolean guessedCorrectly = false; // To track if the user guessed the number

            // Loop to allow the user to make guesses
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt(); // Read user guess
                attempts++; // Increment the attempt counter

                // Check if the guess is correct, too high, or too low
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the number correctly!");
                    guessedCorrectly = true;
                    // Calculate score based on remaining attempts
                    roundScore = maxAttempts - attempts + 1;
                    break; // Exit the loop if guessed correctly
                } else if (userGuess > generatedNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            // If the user couldn't guess the number within max attempts
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + generatedNumber);
            }

            // Update total score and rounds played
            totalScore += roundScore;
            roundsPlayed++;

            // Display the results of the current round
            System.out.println("Your score for this round: " + roundScore);
            System.out.println("Total score: " + totalScore);

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes"); // Continue if the user says "yes"
        }

        // Final results after the game ends
        System.out.println("\nGame over!");
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Final score: " + totalScore);

        // Close the scanner to free resources
        scanner.close();
    }
}
[7:56 pm, 14/1/2025] Reshma: import java.util.Scanner;

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
