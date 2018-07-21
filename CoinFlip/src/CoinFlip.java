
import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
    public static void main(String[] args){
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int value;
        int inputInt = 0;
        String input;

        do{

            System.out.println("Would you like to flip a coin? y/n ");
            input = keyboard.next();

            if(input.equals("y") || input.equals("Y")){
                inputInt = 1;
                value = 1 + r.nextInt(2);

                if(value == 1) System.out.println("The coin flipped heads");
                else if (value == 2) System.out.println("The coin flipped tails");
                else System.out.println("Error 1");
            }
            else if(input.equals("n") || input.equals("N")){
                inputInt = 2;
            }
            else inputInt = 2;


        }while(inputInt != 2);
    }
}
