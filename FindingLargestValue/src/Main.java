import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        int[] arrayOne = new int[10];

        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = r.nextInt(99) + 1;
        }

        int largest = 0;

        System.out.print("Array: ");
        for(int i = 0; i < arrayOne.length; i++){
            System.out.print(arrayOne[i] + " ");

            if(largest < arrayOne[i]){
                largest =  arrayOne[i];
            }
        }
        System.out.println("\nThe largest value is " + largest);


    }
}
