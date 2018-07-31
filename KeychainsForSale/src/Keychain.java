import java.util.Scanner;

public class Keychain {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int choice;
        int keychainQuant = 0;
        double keychainPrice = 10.50;

        System.out.println("KEYCHAIN SHOPPE");
        do{
            menu();
            choice = keyboard.nextInt();
            if(choice == 1){
                keychainQuant = add_keychains(keychainQuant, keyboard);
            }
            else if(choice == 2){
                keychainQuant = remove_keychains(keychainQuant, keyboard);
            }
            else if (choice == 3){
                view_order(keychainQuant, keychainPrice);
            }
            else if(choice == 4){
                checkout(keychainQuant, keychainPrice);
            }
            else System.out.println("Error");
        }while(choice != 4);


    }

    public static void menu(){
        System.out.println("================================");
        System.out.println("\n1.Add Keychains to Order");
        System.out.println("2.Remove Keychains from order");
        System.out.println("3.View Current Order");
        System.out.println("4.Checkout");
        System.out.println("================================");
        System.out.print("\nPlease enter your choice: ");
    }
    public static int add_keychains(int quant, Scanner kb){
        System.out.println("\nADD KEYCHAIN");
        System.out.println("You have " + quant + " keychains");
        System.out.println("How many to add?");
        int adding = kb.nextInt();
        quant += adding;
        System.out.println("Now you have " + quant);
        return quant;

    }
    public static int remove_keychains(int quant, Scanner kb){
        System.out.println("\nREMOVE KEYCHAIN");
        System.out.println("You have " + quant + " keychains");
        System.out.println("How many to remove?");
        int removal = kb.nextInt();
        quant -= removal;
        System.out.println("Now you have " + quant + " keychains");
        return quant;
    }
    public static void view_order(int quant, double keyChainPrice){
        System.out.println("\nVIEW ORDER");
        System.out.println("You have " + quant + " keychains.");
        System.out.println("Total cost is " + (quant * keyChainPrice));
    }
    public static void checkout(int quant, double keyChainPrice){
        System.out.println("\nCHECKOUT");
        System.out.println("You have " + quant);
        System.out.println("Total cost is $" + (quant * keyChainPrice));
        System.out.println("Thanks for your order!");

    }
}
