import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex11_HigherOrLower {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int userGuess = 0;
        int randNum = ThreadLocalRandom.current().nextInt(1, 101);
        boolean guessFlag = false;
        int guessCounter = 0;

        while (!guessFlag) {
            System.out.println("Enter your guess between 1 and 100: ");
            userGuess = sc.nextInt();

            if (userGuess == randNum) {
                System.out.println("Well done, you guessed the right number!");
                guessFlag = true;
            } else if (userGuess > randNum) {
                System.out.println("Too high, guess again!");
            } else if (userGuess < randNum) {
                System.out.println("Too low, guess again!");
            }

            guessCounter++;
        } 

        System.out.println("It took you " + guessCounter + " guesses!");

        sc.close();
    }
}
