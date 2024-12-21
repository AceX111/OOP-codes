package Errors;

import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int userAnswer = scanner.nextInt();
        int correctAnswer = number1 + number2;
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer);
        }
    }
}