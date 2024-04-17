package com.GuessNumber;



import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minRange = 1;
        int maxRange = 100;
        int attempts = 0;
        int score=50;
        int targetNumber = 20;
        int possibleAttempts=2;
        int rounds=3;

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("This Game contains "+rounds+" round.In each round you have to guess the Number ");
        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Can you guess it?");
        System.out.println("Note:You Have Only "+ possibleAttempts*3 +" attempts to play this Game>For Each Round you have 2 Chances.Each attempt you will lose 5 from your score ");
        System.out.println("-------------First Round---------------------");
       
        while (true) {
             attempts = 0;
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            score=score-5;
            
             if(attempts>possibleAttempts)
            {
                System.out.println();
                System.out.println("Sorry "+possibleAttempts+" attempts Completed Try Again!!!!!");
                System.out.println("You Have to Start From the Beginning");
                return;
            }

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly!");
                System.out.println("It took you " + attempts + " attempts.");
                System.out.println("Your Score is "+ score+ " for " + attempts + " attempts.");
                break;
            }
            
           
        }
        System.out.println("-------------Second Round---------------------");
        while (true) {
             attempts = 0;
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            score=score-5;
            
             if(attempts>possibleAttempts)
            {
                System.out.println();
              System.out.println("Sorry "+possibleAttempts+" attempts Completed Try Again!!!!!");
                System.out.println("You Have to Start From the Beginning");
                return;
            }

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly!");
                System.out.println("It took you " + attempts + " attempts.");
                System.out.println("Your Score is "+ score+ " for " + attempts + " attempts.");
                break;
            }
            
           
        }
        System.out.println("-------------Third Round---------------------");
        while (true) {
             attempts = 0;
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            score=score-5;
            
             if(attempts>possibleAttempts-1)
            {
                System.out.println();
                System.out.println("Sorry "+possibleAttempts+" attempts Completed Try Again!!!!!");
                System.out.println("You Have to Start From the Beginning");
                return;
            }

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly!");
                System.out.println("It took you " + attempts + " attempts.");
                System.out.println("Your Score is "+ score+ " for " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}

