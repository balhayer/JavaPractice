import java.util.Scanner;

class Introduction{
	public static void main(String[] args){
		Scanner print = new Scanner(System.in);
		
		String name;
		int age;
		double salary;
		
		System.out.println("Hello. What is your name?");
		name = print.next();
		
		System.out.println("Hi, " + name + "!" + " How old are you?");
		age = print.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not old at all!");
		System.out.println("How much do you make, " + name);
		salary = print.nextDouble();
		
		System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
	}
}