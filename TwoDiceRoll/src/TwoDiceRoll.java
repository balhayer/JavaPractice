import java.util.Random;

public class TwoDiceRoll {
    public static void main(String[] args){
        Random r = new Random();
        int diceOne = 1 + r.nextInt(6);
        int diceTwo = 1 + r.nextInt(6);
        int total = diceOne + diceTwo;
        System.out.println("Dice #1: " + diceOne);
        System.out.println("Dice #2: " + diceTwo);

        System.out.println("The total is " + total);

    }
}
