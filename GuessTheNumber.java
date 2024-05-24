//Task 1 : Number Guessing Game
/*Develop a game where player has to guess the 
number. If guessed number is right, player wins 
else, losses.*/

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to Guess the Number Game! Let's rock it");
        System.out.println("I have picked a number between 1 and 100. Try to guess it.");
        int count=0;
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess Number: ");
            guess = scanner.nextInt();
            
            if (guess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
            } else if (guess < secretNumber) {
                System.out.println("It's too low, Please Try again.");
            } else {
                System.out.println("It's too high, Please Try again.");
            }
		
        }
        scanner.close();
    }
}
