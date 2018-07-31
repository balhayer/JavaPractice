import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        int[] sample = new int[1000];

        for(int i = 0; i < sample.length; i++){
            if(i % 10 == 0){
                System.out.println();
            }
            sample[i] = r.nextInt(89) + 10; //Range from 10 - 99
            System.out.print(sample[i] + " ");
        }
    }
}
