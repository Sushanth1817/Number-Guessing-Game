import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the number guessing game!");

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min; 
        int count = 0;
        int guess;

        System.out.printf("Guess a number from %d to %d:\n", min, max);

        do {
            guess = sc.nextInt(); 
            count++;

            if (guess > randomNumber) {
                System.out.println("Guess too high, try a lower value.");
            } else if (guess < randomNumber) {
                System.out.println("Guess too low, try a higher value.");
            } else {
                System.out.println("Correct guess!");
            }

        } while (guess != randomNumber);

        System.out.printf("Attempts: %d\n", count);
    }
}
