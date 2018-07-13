/* BMI is commonly used by health and nutrition professionals to estimate human body fat in populations. */

/* It is computed by taking the individual''s weight (mass) in kilograms and dividing it by the square of their height in meters */

/* Note: 1lb = 0.453592 and 1ft = 12 inches */

import java.util.Scanner;

class BMIcalculator{
	public static void main(String[] args){
			Scanner print = new Scanner(System.in);
			int feetValue;
			int inchValue;
			double meterValue;
			int poundValue;
			double kilogramValue;
			double bmiValue;
			
			System.out.println("Your height (feet only)");
			feetValue = print.nextInt();
			System.out.println("Your height (inches)");
			inchValue = print.nextInt();
			System.out.println("Your weight (lbs)");
			poundValue = print.nextInt();
			
			inchValue += feetValue * 12;
			meterValue = inchValue * .0254;
			
			kilogramValue = poundValue * 0.453592;
			bmiValue = kilogramValue / (meterValue * meterValue);
			
			System.out.println("Your BMI is " + bmiValue);
	}
}