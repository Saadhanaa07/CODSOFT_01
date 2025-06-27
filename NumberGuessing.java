import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        while (true) {
            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            boolean won = false;

            System.out.println("\n🎮 Guess the number between 1 and 100 (Attempts left: " + attempts + ")");

            while (attempts-- > 0) {
                System.out.print("Your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("✅ Correct! 🎉");
                    score++;
                    won = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                System.out.println("Attempts left: " + attempts);
            }

            if (!won) {
                System.out.println("❌ Game over! The number was " + number);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Play again? (yes/no): ");
            String again = sc.next();
            if (!again.equalsIgnoreCase("yes")) break;
        }

        sc.close();
        System.out.println("Thank you for playing! 💖");
    }
}
