package ConstructorPractice;

import java.util.Scanner;

// in this code, we are going to practice our contructor making
// User will DIY a car, with specs and performance based on user's input. Amazing

public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Input horsepower: ");
		int hp = s.nextInt();
		s.nextLine(); // consume leftover newline
		System.out.println("Input engine type: ");
		String eng = s.nextLine(); // v12 etc etc 
		System.out.println("Input body type: ");
		String ty = s.nextLine();; //sedan hatchback etc
		System.out.println("Input wheel-drive: ");
		String wd = s.nextLine();; //AWD RWD FWD
		
		Car c = new Car(hp, eng, ty, wd); 
		

	}
	

}
