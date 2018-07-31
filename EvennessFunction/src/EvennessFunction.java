public class EvennessFunction {
    public static void main(String[] args){
        for(int i = 1; i <=  20; i ++){
            System.out.print(i);
            if(isEven(i)){
                System.out.print(" < ");
            }
            else if(isDivisibleBy3(i)){
                System.out.print(" = ");
            }
            System.out.println();
        }
    }
    public static boolean isEven(int n ){
        if(n % 2 == 0){
            return true;
        }
        else return false;
    }
    public static boolean isDivisibleBy3(int n){
        if(n % 3 == 0){
            return true;
        }
        else return false;
    }
}
