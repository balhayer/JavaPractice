import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] name = {"Randy", "Oliver", "Jason", "Rick"};
        double[] gpa = {3.75, 2.0, 2.40, 4.5};
        int[] id = {34552, 32245, 33225, 33134};

        System.out.println("Values: ");
        for(int i = 0; i < name.length; i ++){
            System.out.println(name[i] + " " + gpa[i] + " " + id[i]);
        }
        System.out.println();
        System.out.println("ID number to find: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        for(int i = 0; i < id.length; i++){
            if(userInput == id[i]){
                System.out.println("Found in slot " + i);
                System.out.println("Name: " + name[i]);
                System.out.println("Average: " + gpa[i]);
                System.out.println("ID: " + id[i]);

            }
        }
    }
}
