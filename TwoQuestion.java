import java.util.Scanner;

public class TwoQuestion{
	public static void main(String[] args){
	Scanner print = new Scanner(System.in);
	String questionOne;
	String questionTwo;
	String result;
	
	System.out.println("Question 1) Is it animal, vegetable, or mineral?");
	questionOne = print.nextLine();
	System.out.println("Question 2) Is it bigger than a breadbox?");
	questionTwo = print.nextLine();

	if(questionOne.equals("animal")){
		if(questionTwo.equals("yes")) result = "moose";
		else if (questionTwo.equals("no")) result = "squirrel";
		else result ="ERROR 1";
	}
	else if(questionOne.equals("vegetable")){
		if(questionTwo.equals("yes")) result = "Watermelon";
		else if (questionTwo.equals("no")) result = "carrot";
		else result = "Error 2";
	}
	else if(questionOne.equals("mineral")){
		if(questionTwo.equals("yes")) result = "Camaro";
		else if(questionTwo.equals("no")) result = "paper clip";
		else result = "Error 3";
	}
	else {
		result = "Error 4";
	}
	
	System.out.println("You're thinking of a " + result);
	System.out.println("I would ask you if I'm right, but I don't actually care.");
	
	}
}