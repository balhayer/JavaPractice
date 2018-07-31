import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try{
            File file = new File("name.txt");
            if(file.exists()){
                Scanner sc = new Scanner(file);
                while(sc.hasNext()){
                    System.out.println(sc.next());
                }
            }

            Formatter f = new Formatter("name.txt");
            f.format("%s %s", "Randy", "Le");
            f.close();



        }catch(Exception e){
            System.out.println("Error");
        }

    }
}
