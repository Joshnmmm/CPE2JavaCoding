package defaultt;
import java.util.Scanner;
public class distanceCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		double x1, y1, x2, y2, distance; 
		System.out.printf("Enter x1 and y1: "); 
		x1 = s.nextDouble(); 
		y1 = s.nextDouble(); 
		System.out.printf("Enter x2 and y2: "); 
		x2 = s.nextDouble(); 
		y2 = s.nextDouble(); 
		
		
		distance = Math.pow((Math.pow(x2-x1, 2) + (Math.pow(y2-y1, 2))), 0.5); 
		System.out.println("The distance between the two points is: " + distance); 
		s.close();
		
		

	}

}
