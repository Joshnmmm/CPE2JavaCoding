package defaultt;
import java.util.Scanner;

public class shortestCoins {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
		
		System.out.println("Please Enter Your Money: (0-99)"); 
		int money = s.nextInt(); 
		s.close();
		if(money >= 100 || money < 0) {
			System.out.println("Amount too large or ammount is negative!"); 
			return; 
		}
		
		int coin25 = money / 25; 
		money %= 25; 
		
		int coin10 = money / 10;
		money %= 10;
		
		int coin5 = money / 5; 
		money %= 5;
		
		int coin1 = money; 
		
		
		System.out.println("/25's/ coin used:" + coin25);
		System.out.println("/10's/ coin used:"+ coin10);
		System.out.println("/5's/ coin used:"+ coin5);
		System.out.println("/1's/ coin used:"+ coin1);

	}

}
