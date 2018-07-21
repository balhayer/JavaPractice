import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args){
        Random r = new Random();
        Scanner print = new Scanner(System.in);

        int randomChoice = 1 + r.nextInt(3);

        System.out.println("There are three cards laying face down.");
        System.out.println("There is only one ace of the three cards.");
        System.out.println("Which card is the ace.");

        System.out.println(" ");
        System.out.println("##  ##  ##");
        System.out.println("##  ##  ##");
        System.out.println("1   2   3");

        int userChoice = print.nextInt();

        if(randomChoice == 1) {
            System.out.println("AA  ##  ##");
            System.out.println("AA  ##  ##");
            System.out.println("1   2   3");
        }
        else if(randomChoice == 2){
            System.out.println("##  AA  ##");
            System.out.println("##  AA  ##");
            System.out.println("1   2   3");
        }
        else if(randomChoice == 3){
            System.out.println("##  ##  AA");
            System.out.println("##  ##  AA");
            System.out.println("1   2   3");
        }
        else System.out.println("Error");


        if(userChoice == randomChoice) System.out.println("Wow you guessed it correctly!");
        else if (userChoice != randomChoice) System.out.println("Sorry, you guessed wrong!");
        else System.out.println("Er2ror:2");
    }
}
