import java.util.Scanner;
import java.util.Random;

public class Blackjack {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        String input;

        int total;
        int cardOne;
        int cardTwo;
        int hitCard;

        int totalDealer;
        int cardOneDealer;
        int cardTwoDealer;
        int hitCardDealer;
        int dealerChoice;

        System.out.println("=====================================");
        System.out.println("Welcome to Randy's blackjack program.");
        System.out.println("=====================================");

        do{
            dealerChoice = 1;
            cardOneDealer = 1 + r.nextInt(10);
            cardTwoDealer = 1 + r.nextInt(10);
            totalDealer = cardOneDealer + cardTwoDealer;

            cardOne = 1 + r.nextInt(10); //Random Number for 1 - 10
            cardTwo = 1 + r.nextInt(10);
            total = cardOne + cardTwo;

            System.out.println("You get a " + cardOne + " and " + cardTwo);
            System.out.println("Your total is : " + total);

            System.out.println("\nThe dealer has a " + cardOneDealer + " showing, and a hidden card.");
            System.out.println("His total is hidden, too");
            do{
                System.out.println("\nWould you like to \"hit\" or \"stay\"?");
                input = keyboard.next();

                if(input.equalsIgnoreCase("hit")){
                    hitCard = 1 + r.nextInt(10);
                    total += hitCard;
                    System.out.println("\nYou drew a " + hitCard + ".");
                    System.out.println("Your total is " + total);

                    if(total > 21){
                        System.out.println("You drew too many cards! I recommend typing \"stay\" ");
                    }
                }
                else if(input.equalsIgnoreCase("stay")){

                    while(dealerChoice != 0){
                        if(totalDealer < 14){
                            hitCardDealer = 1 + r.nextInt(10);
                            totalDealer += hitCardDealer;

                            System.out.println("Dealer drew a " + hitCardDealer);
                            System.out.println("Dealer's total is " + totalDealer);
                            dealerChoice = 1;
                        }
                        else if(totalDealer > 14){
                            dealerChoice = 0;
                            System.out.println("\nThe Dealer's final total is " + totalDealer);
                        }
                        else System.out.println("Error 0");
                    }

                }
                else{
                    System.out.println("Error 1");
                }
            }while(!input.equalsIgnoreCase("stay"));

            //Comparison to who won
            if(total > 21){
                System.out.println("You overdrew, you have lost");
            }
            else if(total == 21 && totalDealer == 21){
                System.out.println("You and the dealer have 21, its a draw");
            }
            else if(total == totalDealer){
                System.out.println("it's a draw!");
            }
            else if(total > totalDealer){
                System.out.println("You beat the dealer");
            }
            else if(totalDealer > total){
                System.out.println("The dealer beat your hand");
            }
            else System.out.println("Error 2");

            System.out.println("Would you like to play again? \"yes\" or \"no\".");
            input = keyboard.next();

        }while(!input.equalsIgnoreCase("no"));



    }
}
