import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int secret;
        
        secret = random.nextInt(100) + 1;
        int guess;
        String reaction;
        
        do {
            System.out.println("Guess a number between 1-100");
            guess = input.nextInt();
            if (guess == 0) {
                System.out.println("Pathetic!");
            } else {
                if (guess == secret) {
                    System.out.println("correct");
                } else {
                    if (guess < secret) {
                        System.out.println("guess is too low.");
                    } else {
                        if (guess > secret) {
                            System.out.println("guess is too high.");
                        }
                    }
                }
            }
            System.out.println("play again?");
            reaction = input.nextLine();
        } while (reaction.equals("y"));
    }
}
