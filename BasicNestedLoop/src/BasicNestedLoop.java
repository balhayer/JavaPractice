public class BasicNestedLoop {
    public static void main(String[] args){
        for(int x = 0; x <= 5; x++){
            for(int y = 0; y <= 5; y++){
                System.out.print("(" + x + "," + y + ") ");
            }
            System.out.println();
        }
    }
}
