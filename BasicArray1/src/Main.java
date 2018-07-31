import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        int[] sample = new int[10];

        for(int i = 0; i < sample.length; i++){
            sample[i] = r.nextInt(100) + 1;
        }
        for(int i = 0; i < sample.length; i++){
            System.out.println(sample[i]);
        }
    }
}
