import java.util.Scanner;

class AskingQuestion{
	public static void main(String[] args){
		Scanner print = new Scanner(System.in);
		
		int feetValue;
		int inchValue;
		
		System.out.println("Enter the feet value :");
		feetValue = print.nextInt();
		
		System.out.println("Enter the inch value :");
		inchValue = print.nextInt();
		
		System.out.println("You are " + feetValue + " feet and " + inchValue + " inch tall");
	}
}