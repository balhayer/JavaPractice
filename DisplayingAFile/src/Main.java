import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Which file do you want to read? ");
        userInput = sc.next();

        try{
            File file = new File(userInput);
            if (file.exists()) {
                System.out.println(file.getName() + " exists.");

                sc = new Scanner(file);
                while(sc.hasNext()){
                    System.out.println(sc.next());
                }

            }else System.out.println(file.getName() + " does not exist.");
        }catch(Exception e) {
            System.out.println("Error Exception");
        }
    }
}
