import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HighScore {
    public static void main(String[] args){

        try{
            FileWriter out = new FileWriter("score.txt");
            Scanner keyboard = new Scanner(System.in);

            System.out.println("You got a high score!");
            System.out.print("Please enter your score");
            int score = keyboard.nextInt();
            System.out.print("Please enter your name");
            String name = keyboard.next();
            out.write(name + "\r\n");
            out.write(score + "\r\n");
            out.close();

        }catch(IOException e){
            System.out.println("Error");
        }

        try{
            FileReader in = new FileReader("score.txt");
            Scanner sc = new Scanner(in);
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        }catch(IOException e){
            System.out.println("FilerReader error");
        }




    }
}