package defaultt;
import java.util.Scanner;


public class multiplyTheDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		
		
		
		System.out.printf("Enter a number between 0 and 1000:");
		int number = s.nextInt(); 
		s.close();
		int lastNum, midNum, firstNum, product; 
		lastNum = number%10; 
		midNum = (number/10)%10; 
		firstNum = (number/100)%10; 
		if(firstNum == 0) {
			product = midNum*lastNum; 
		}
		else if(firstNum == 0 && midNum == 0) {
			product = lastNum; 
		}
		else {
			product = firstNum * midNum * lastNum; 
		}
		System.out.printf("%d\n%d\n%d\n", firstNum, midNum, lastNum);
		System.out.println("The product of all digits in " + number + " is " + product);
		//comments
	}

}



