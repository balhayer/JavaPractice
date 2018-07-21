import java.util.Scanner;
import java.util.Random;

public class WhileGuessing {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int userInput = 0;
        //Guessing game 1 - 10
        int guessNum = 1 + r.nextInt(10);

        System.out.println("Guess a number from 1 - 10 ");
        userInput = keyboard.nextInt();
        while(userInput != guessNum){
            System.out.println("Wrong, try again :) ");
            System.out.println("\nGuess a number from 1 - 10 ");
            userInput = keyboard.nextInt();

        }

        System.out.println("Yah, you guessed it. It was " + guessNum);

    }
}
