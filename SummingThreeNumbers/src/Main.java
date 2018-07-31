import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try{
            File file = new File("src/sumTextTwo");
            List<Integer> list = new ArrayList<Integer>();
            int value = 0;
            Scanner sc = new Scanner(file);
            if(file.exists()){
                System.out.println(file.getName() + " file exists.");
                while(sc.hasNext()){
                    list.add(Integer.parseInt(sc.next()));
                }

                Iterator<Integer> it = list.iterator();
                while(it.hasNext()){
                    value += it.next();
                }

                for(int i = 0; i < list.size(); i++){
                    if(i != list.size() - 1)
                    System.out.print(list.get(i) + " + ");
                    else System.out.print(list.get(i));
                }
                System.out.print(" = " + value);


            }
            else System.out.println(file.getName() + " file could not be found");

        }catch(Exception e){
            System.out.println("Error");
        }

    }
}
