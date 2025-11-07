import java.util.*;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\nGuess a number between 1 and 100. You have " + maxAttempts + " attempts!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("✅ Correct! You guessed it in " + attempts + " tries!");
                    score++;
                    guessed = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! 📉");
                } else {
                    System.out.println("Too high! 📈");
                }
            }

            if (!guessed) {
                System.out.println("❌ Out of attempts! The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("\n🎮 Game Over! Your total score: " + score);
        sc.close();
    }
}
