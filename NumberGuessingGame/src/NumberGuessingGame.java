import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        Random r = new Random();
        Scanner print = new Scanner(System.in);

        int guessedNum = 1 + r.nextInt(10);
        int choiceNum;

        System.out.println("Guess a number from 1 - 10. ");
        choiceNum = print.nextInt();

        if(choiceNum == guessedNum) System.out.println("That's correct, I was thinking of the number " + guessedNum);
        else if (choiceNum != guessedNum) System.out.println("Nope, I was thing of the number " + guessedNum);
        else System.out.println("Guessing Game Error!");
    }
}
