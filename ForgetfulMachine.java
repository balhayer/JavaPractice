
import java.util.Scanner;

class ForgetfulMachine{
	public static void main(String[] args){
		Scanner print = new Scanner(System.in);
		
		System.out.println("Give me a word");
		print.next();
		
		System.out.println("Give me a second word");
		print.next();
		
		System.out.println("Great, now your favorite number");
		print.next();
		
		System.out.println("And your second-favorite number ...");
		print.next();
		
		System.out.println("Whew! Wasn't that fun?");
	}
}
