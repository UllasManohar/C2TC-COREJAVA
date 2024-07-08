package java1;

import java.util.Scanner;
import java.util.Random;

public class JavaRandomClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1; // Generates random number between 1 and 100
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the Random Number Game!");
        System.out.println("Guess the number between 1 and 100:");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
        
        scanner.close();
    }
}
