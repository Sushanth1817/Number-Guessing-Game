import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the number guessing game!");

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min; 
        int count = 0;
        int guess;

        System.out.printf("Guess a number from %d to %d:", min, max);
        System.out.println();
        System.out.println("guess in 3 attempts for full score");

        do {
            
            count++;
            System.out.println("Attempt: "+count);
            guess = sc.nextInt(); 
            if (guess > randomNumber) {
                System.out.println("Guess too high, try a lower value.");
            } else if (guess < randomNumber) {
                System.out.println("Guess too low, try a higher value.");
            } else {
                System.out.println("Correct guess!");
            }

        } while (guess != randomNumber);
        System.out.println();
        System.out.println();
         if(count>0 && count<3){
        System.out.printf("score 100 Congrats!!! on getting full score ;)  Attempts: %d\n", count);
        System.out.println();
         }
         else if(count>3 && count<6){
             System.out.printf("score 90 Attempts: %d\n", count);
             System.out.println();
         }
         else if(count>6 && count <10){
             System.out.printf("score 80 Attempts: %d\n", count);
             System.out.println();
         }
         else{
             System.out.printf("score 70 try again for a good score Attempts: %d\n", count);
            System.out.println();
                }
    }
}
