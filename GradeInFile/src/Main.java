import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name(First Last): ");
        String name = sc.nextLine();

        System.out.print("Filename: ");
        File file = new File(sc.next());

        int[] arrayOne = new int[5];
        Random r = new Random();
        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = r.nextInt(99) + 1;
            System.out.println(arrayOne[i]);
        }

        try{
            FileWriter fw = new FileWriter(file);
            fw.write(name + "\n");
            for(int i = 0; i < arrayOne.length; i ++){
                fw.write(arrayOne[i] + " ");
            }
            fw.close();

        }catch (IOException e){
            System.out.println("Error Found Here");
        }
    }
}
