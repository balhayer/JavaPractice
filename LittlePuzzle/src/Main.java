import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String userInput;
        boolean fileFound = false;

        System.out.print("Open which file: ");
        userInput = sc.next();

        File file = new File(userInput);
        if(file.exists()){
            System.out.println(file.getName() + " exists.");
            System.out.println("Now opening " + file.getName());
            fileFound = true;
        }
        else{
            System.out.println(file.getName() + " does not exist or can not be found.");
            System.out.println("Now exiting program");
            fileFound = false;
        }

        if(fileFound){
            try{
                String textFile = "";
                Scanner fileRead = new Scanner(file);
                String throwAway = "";

                textFile = fileRead.next();

                System.out.println("Showing puzzle text now: ");
               for(int i = 0; i < textFile.length(); i ++){
                   if(i % 3 == 0){
                       System.out.print(textFile.charAt(i));
                   }
                   else{
                       throwAway += textFile.charAt(i);
                   }
               }
                System.out.println("\nShowing thrown away characters now: ");
                System.out.println(throwAway);

                fileRead.close();

            }
            catch (Exception e){
                System.out.println("Error");
            }

        }
    }

}
