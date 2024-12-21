package Errors;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("🎉 Welcome to the Random Number Guessing Game! 🎉");

        while (playAgain) {
            int numberToGuess = random.nextInt(10) + 1; // Random number between 1 and 10
            int attempts = 5;

            System.out.println("\nI'm thinking of a number between 1 and 10.");
            System.out.println("You have 5 attempts to guess it. Good luck!");

            while (attempts > 0) {
                System.out.print("\nEnter your guess (1-10): ");
                int guess;

                try {
                    guess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Invalid input! Please enter a number.");
                    continue;
                }

                if (guess < 1 || guess > 10) {
                    System.out.println("⚠️ Please choose a number between 1 and 10!");
                    continue;
                }

                if (guess == numberToGuess) {
                    System.out.println("🎉 Congratulations! You guessed the number!");
                    break;
                } else if (guess < numberToGuess) {
                    String[] lowResponses = {
                            "Too low! Aim a little higher.",
                            "Not quite there, try going higher.",
                            "That's too low. Think bigger!"
                    };
                    System.out.println(lowResponses[random.nextInt(lowResponses.length)]);
                } else {
                    String[] highResponses = {
                            "Too high! Lower your sights.",
                            "You're too high. Try going lower.",
                            "That's too much. Scale it down!"
                    };
                    System.out.println(highResponses[random.nextInt(highResponses.length)]);
                }

                attempts--;
                if (attempts > 0) {
                    System.out.println("You have " + attempts + " attempts remaining.");
                } else {
                    System.out.println("😞 Out of attempts! The number was " + numberToGuess + ". Better luck next time!");
                }
            }

            System.out.print("\nWould you like to play again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        System.out.println("\nThank you for playing! Goodbye! 👋");
    }
}

