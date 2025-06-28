import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;  // Keeps track of how many times the player guessed correctly

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is? You have 5 chances each round.\n");

        while (true) {
            int targetNumber = random.nextInt(100) + 1;  // Generates a number between 1 and 100
            int attemptsLeft = 5;
            boolean guessedCorrectly = false;

            System.out.println("🔁 New Round Begins!");
            System.out.println("You have " + attemptsLeft + " attempts to guess the number.");

            while (attemptsLeft-- > 0) {
                System.out.print("👉 Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("✅ Spot on! You guessed the number correctly! 🎉");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("⬇️ Too low! Try a higher number.");
                } else {
                    System.out.println("⬆️ Too high! Try a lower number.");
                }

                System.out.println("🕒 Attempts remaining: " + attemptsLeft + "\n");
            }

            if (!guessedCorrectly) {
                System.out.println("❌ You've used all your attempts!");
                System.out.println("The correct number was: " + targetNumber);
            }

            System.out.println("🏆 Your current score: " + score);
            System.out.print("🔄 Would you like to play another round? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;  // Exit the game loop
            }

            System.out.println("\n----------------------------------\n");
        }

        scanner.close();
        System.out.println("💖 Thank you for playing! See you next time!");
    }
}
