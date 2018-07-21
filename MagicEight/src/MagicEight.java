import java.util.Random;

public class MagicEight {
    public static void main(String[] args){
        Random r = new Random();
        String response = " ";

        int choice = 1 + r.nextInt(10);

        if( choice == 1) response = "It is certain.";
        else if (choice == 2) response = "It is decidely so.";
        else if (choice == 3) response = "Without a doubt.";
        else if (choice == 4) response = "Yes - definitely.";
        else if (choice == 5) response = "You may reply on it.";
        else if (choice == 6) response = "As I see it, yes.";
        else if (choice == 7) response = "Outlook good.";
        else if (choice == 8) response = "Signs point to yes.";
        else if (choice == 9) response = "Yes.";
        else if (choice == 10) response = "No.";
        else response = "Magic Eight Ball Error.";

        System.out.println("Magic Eight Ball Says: " + response);
    }
}
