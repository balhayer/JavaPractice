
import static java.lang.Math.pow;

import java.sql.SQLOutput;
import java.util.Scanner;
public class AreaCalculator {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int choice;

        do{
            menu();
            choice = keyboard.nextInt();
            if(choice == 1){            //Triangle Choice
                System.out.print("Base: ");
                int base = keyboard.nextInt();
                System.out.print("Height: ");
                int height = keyboard.nextInt();
                double result = area_triangle(base, height);
                System.out.println("The area is " + result);
            }
            else if (choice == 2){      //Rectangle Choice
                System.out.print("Length: ");
                int length = keyboard.nextInt();
                System.out.print("Width: ");
                int width = keyboard.nextInt();
                int result = area_rectangle(length, width);
                System.out.println("The area is " + result);
            }
            else if (choice == 3){      //Square Choice
                System.out.println("Side: ");
                int side = keyboard.nextInt();
                int result = area_square(side);
                System.out.println("The area is " + result);
            }
            else if (choice == 4){      //Circle Choice
                System.out.println("Radius: ");
                int radius = keyboard.nextInt();
                double result = area_circle(radius);
                System.out.println("THe area is " + result);
            }
            else if (choice == 5){      //Quit Choice
                System.out.println("Exiting program right now...");
            }
            else choice = 0;
        } while(choice != 5);

    }
    public static void menu(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\n1.Triangle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.println("4.Circle");
        System.out.println("5.Quit");
        System.out.print("Which shape?: ");
    }
    public static double area_circle(int radius){
        //Area = pi * r^2
        return Math.PI * pow(radius,2);
    }
    public static int area_rectangle(int length, int width){
        //Area = l * w
        return length * width;
    }
    public static int area_square(int side){
        //Area = s^2
        return side * side;
    }
    public static double area_triangle(int base, int height){
        //Area = (1/2) * b * h
        return base * height / 2;
    }
}
