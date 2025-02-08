import java.util.Random;
import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

      
        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number (between 1 and 100):");

        while (guess != randomNumber) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("Number of attempts: " + attempts);
            }
        }
    }
}
