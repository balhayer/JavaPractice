import java.util.Scanner;

public class EnterYourPin {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("Welcome to the bank.");
        System.out.print("Enter your PIN: ");
        int input = keyboard.nextInt();

        while( input != pin){
            System.out.println("\nSorry that is the incorrect PIN. Try again.");
            System.out.print("Enter your PIN: ");
            input = keyboard.nextInt();
        }

        System.out.println("\nPIN Accepted. You now have access to your account. ");
    }
}
