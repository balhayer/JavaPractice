import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] arrayOne = new int[10];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int userChoice;
        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = r.nextInt(49) + 1;
        }

        System.out.print("Array: ");
        for(int i = 0; i < arrayOne.length; i++){
            System.out.print(arrayOne[i] + " ");
        }

        System.out.print("\nValue to find: ");
        userChoice = sc.nextInt();

        for(int i = 0; i < arrayOne.length; i++){
            if(userChoice == arrayOne[i]){
                System.out.println(userChoice + " is in the array.");
            }
        }
    }
}
