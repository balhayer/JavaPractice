import java.util.Scanner;

class WhatIf{
	public static void main(String[] args){
		Scanner print = new Scanner(System.in);
		int age;
		String name;
		
		System.out.print("Hey, what's your name? ");
		name = print.next();
		
		System.out.print("Ok, " + name + ",how old are you? ");
		age = print.nextInt();
		
		if(age < 16)
			System.out.println("You can't drive.");
		if(age < 18)
			System.out.println("You can't vote.");
		if(age < 25)
			System.out.println("You can't rent a car.");
		if(age >= 25)
			System.out.println("You can do anything that's legal.");
	}
}