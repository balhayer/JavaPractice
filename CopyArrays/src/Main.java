import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] arrayOne = new int[10];
        Random r = new Random();

        for(int i = 0; i < arrayOne.length; i ++){
            arrayOne[i] = r.nextInt(99) + 1;
        }

        int[] arrayTwo = new int[arrayOne.length];
        for(int i = 0; i < arrayTwo.length; i++){
            arrayTwo[i] = arrayOne[i];
        }

        System.out.print("Array 1: ");
        for(int i = 0; i < arrayOne.length; i ++){
            System.out.print(arrayOne[i] + " ");
        }

        System.out.print("\n\nArray 2: ");
        for(int i = 0; i < arrayTwo.length; i ++){
            System.out.print(arrayTwo[i] + " ");
        }
    }
}
