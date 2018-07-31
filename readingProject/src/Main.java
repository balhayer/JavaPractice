import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            File file = new File("sample.txt");

            if(file.exists()) System.out.println(file.getName() + " exists!");
            else System.out.println(file.getName() + " does not exist");

            Scanner kb = new Scanner(file);
            while(kb.hasNext()){
                System.out.println(kb.next());
            }
            kb.close();

        }
        catch(FileNotFoundException e){
            System.out.println("Error");
        }

        try {
            Formatter f = new Formatter("test.txt");
            f.format("%s %s %s", "1", "Randy", "Smith \r\n");
            f.format("%s %s %s", "2", "Hello", "Brown \r\n");
            f.close();
        }catch (FileNotFoundException e){
            System.out.println("Formatter Error");
        }
    }
}
