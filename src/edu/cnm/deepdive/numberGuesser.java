package edu.cnm.deepdive;

import java.util.*;

public class numberGuesser {

  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    while ( playOneRound()){

    }

  }

  private static boolean playOneRound() {
    int secret = random.nextInt(100) + 1;

    while (guessAndCheck(secret));
    System.out.println("play again?");
    String reaction;
    do {
      reaction = input.nextLine().trim().toLowerCase();
    } while (reaction.isEmpty());
    return reaction.charAt(0) == 'y';
  }

  private static boolean guessAndCheck(int secret) {
    boolean guessAgain = true;
    System.out.println("Guess a number between 1-100");
    int guess = input.nextInt();
    if (guess == 0) {
      guessAgain = false;
      System.out.println("Pathetic!");
    } else if (guess == secret) {
      guessAgain = false;
      System.out.println("correct");
    } else if (guess < secret) {
      System.out.println("guess is too low.");
    } else {
      System.out.println("guess is too high.");
    }
    return guessAgain;
  }
}
