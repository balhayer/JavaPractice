import java.util.Scanner;

class SpaceBoxing{
	public static void main(String[] args){
		Scanner print = new Scanner(System.in);
		int userInput;
		double currentWeight;
		double newWeight;
		
		double venus = 0.78;
		double mars = 0.39;
		double jupiter = 2.65;
		double saturn = 1.17;
		double uranus = 1.05;
		double neptune = 1.23;
		
		System.out.print("Please enter your current earth weight: ");
		currentWeight = print.nextDouble();
		System.out.println("1. Venus		2. Mars 	3. Jupiter");
		System.out.println("4. Saturn 		5. Uranus	6. Neptune");
		
		System.out.print("Which planet are you visiting? ");
		userInput = print.nextInt();
		
		if(userInput == 1) newWeight = venus * currentWeight;
		else if(userInput == 2) newWeight = mars * currentWeight;
		else if(userInput == 3) newWeight = jupiter * currentWeight;
		else if(userInput == 4) newWeight = saturn * currentWeight;
		else if(userInput == 5) newWeight = uranus * currentWeight;
		else if(userInput == 6) newWeight = neptune * currentWeight;
		else {
			System.out.println("Invalid Input, you have stayed on earth.");
			newWeight = currentWeight;
		}
		
		System.out.println("Your weight would be " + newWeight + "pounds on that planet.");
	
	}
}