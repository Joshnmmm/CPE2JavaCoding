package defaultt;

import java.util.Scanner;

public class chocolateBars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		double bmrMale, bmrFemale; 
		double weight, height, age; 
		final double CHOCOLATE_BAR = 230; 
		
		double numOfChocBarsMale;
		double numOfChocBarsFemale;
		
		System.out.printf("Please input your weight in pounds: "); 
		weight = s.nextDouble(); 
		System.out.printf("Please input your height in inches: "); 
		height = s.nextDouble(); 
		System.out.printf("Please input your age in years: "); 
		age = s.nextDouble(); 
		
		
		bmrMale = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		numOfChocBarsMale = bmrMale / CHOCOLATE_BAR;
		bmrFemale = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		numOfChocBarsFemale = bmrFemale / CHOCOLATE_BAR; 
		
		System.out.printf("\nMale Calculated BMR: %.2f\n",bmrMale);
		System.out.printf("No. of chocolate male: %.2f\n", numOfChocBarsMale);
		System.out.printf("\nFemale Calculated BMR: %.2f\n", bmrFemale);
		System.out.printf("No. of chocolate female: %.2f\n ", numOfChocBarsFemale);
		s.close();
	}

}
