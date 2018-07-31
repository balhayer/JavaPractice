import java.io.File;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String userInput;
        Scanner sc = new Scanner(System.in);
        boolean fileFound; //Use of boolean variable to have cleaner code.

        //Asking user to type in file name to be executed
        System.out.println("Open which file: ");
        userInput = sc.next();

        File file = new File(userInput);

        //This checks if the file exists, if not, the program will then exit
        if(file.exists()){
            System.out.println(file.getName() + " exists");
            System.out.println("Now loading " + file.getName() + "file.");
            fileFound = true;
        }
        else{
            System.out.println(file.getName() + " does not exist or can not be found.");
            System.out.println("Now closing program");
            fileFound = false;
        }

        //If the file exists and opens successfully it will proceed into this if statement
        if(fileFound){
            try{
                Scanner fileRead = new Scanner(file);
                String text;
                char[] textCharArray;

                while(fileRead.hasNext()){
                    text = fileRead.next();
                    textCharArray = text.toCharArray();
                    for(int i = 0; i < text.length(); i++ ){
                        if(text.charAt(i) == 'a') textCharArray[i] = 'A';

                        else if(text.charAt(i) == 'e') textCharArray[i] = 'E';

                        else if(text.charAt(i) == 'i') textCharArray[i] = 'I';

                        else if(text.charAt(i) == 'o') textCharArray[i] = 'O';

                        else if(text.charAt(i) == 'u') textCharArray[i] = 'U';
                    }
                    System.out.println(textCharArray);
                }

            }catch(Exception e){
                System.out.println("Error");
            }

        }

    }
}
