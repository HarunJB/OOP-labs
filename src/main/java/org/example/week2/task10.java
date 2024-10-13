package org.example.week2;
import java.util.Scanner;

public class task10 {

    static public void main(String[] args) {
        randomNumberGuesser();
    }
    static public void randomNumberGuesser() {
        Scanner sc = new Scanner(System.in);
        int realGuess = 39;
        int counter = 0;
        int guess = -1;

        System.out.println("Guess the number: ");

        while (guess != realGuess) {
            guess = sc.nextInt();
            counter++;
            if (guess > realGuess) {
                System.out.println("Higher!  -  This is your " + counter + ". guess");
            }
            else if (guess < realGuess) {
                System.out.println("Lower!  -  This is your " + counter + ". guess");
            }
            else {
                System.out.println("You are correct!");
                System.out.println("You made " + counter + " guesses !");
            }
        }
    }
}
