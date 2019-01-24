package edu.cnm.deepdive;

import java.util.*;

public class numberGuesser {

  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    boolean playAgain;

    do {
      int secret = random.nextInt(100) + 1;
      boolean correct = false;
      boolean forfeit = false;
      do {
        System.out.println("Guess a number between 1-100");
        int guess = input.nextInt();
        if (guess == 0) {
          forfeit = true;
          System.out.println("Pathetic!");
        } else if (guess == secret) {
          correct = true;
          System.out.println("correct");
        } else if (guess < secret) {
          System.out.println("guess is too low.");
        } else {
          System.out.println("guess is too high.");
        }
      } while (!correct && !forfeit);
      System.out.println("play again?");
      String reaction;
      do {
        reaction = input.nextLine().trim().toLowerCase();
      } while (reaction.isEmpty());
      playAgain = reaction.charAt(0) == 'y';
    } while (playAgain);
  }
}
