import java.util.Random;

public class Randomness {
    public static void main(String[] args){
        Random r = new Random();

        int i = r.nextInt(10);
        System.out.println("My first number is: " + i);

        System.out.println( 1 + r.nextInt(10) );
        System.out.println( 1 + r.nextInt(10));


    }
}
