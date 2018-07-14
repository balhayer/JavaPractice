import java.util.Scanner;

public class TwoQuestion{
	public static void main(String[] args){
	Scanner print = new Scanner(System.in);
	String questionOne;
	String questionTwo;
	String result;
	
	System.out.println("Question 1) Is it animal, vegetable, or mineral?");
	questionOne = print.next();
	System.out.println("Question 2) Is it bigger than a breadbox?");
	questionTwo = print.next();
	
	if(questionOne == "animal"){
		if(questionTwo == "yes") result = "moose";
		else if (questionTwo == "no") result = "squirrel";
		else result = "KOI FISHHHHH";
	}
	else if(questionOne == "vegetable"){
		if(questionTwo == "yes") result = "Watermelon";
		else if (questionTwo == "no") result = "carrot";
		else result = "KOI FISHHHH";
	}
	else if(questionOne == "mineral"){
		if(questionTwo == "yes") result = "Camaro";
		else if(questionTwo == "no") result = "paper clip";
		else result = "KOI FISHHH";
	}
	else result = "KOI Error";
	
	System.out.println("You're thinking of a " + result);
	System.out.println("I would ask you if I'm right, but I don't actually care.");
	
	}
}