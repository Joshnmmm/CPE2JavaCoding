package defaultt;

import java.util.Scanner;

public class decToHex {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

	        System.out.print("Enter a decimal number: ");
	        int decimal = s.nextInt();

	        if (decimal == 0) {
	            System.out.println("Hexadecimal number: 0");
	            return;
	        }
	        String hex = "";
	        int number = decimal;
	        while (number > 0) {
	            int remainder = number % 16;
	            char hexDigit;
	            if (remainder < 10) {
	                hexDigit = (char) ('0' + remainder); 
	            } else {
	                hexDigit = (char) ('A' + (remainder - 10)); 
	            }
	            hex = hexDigit + hex;

	            number /= 16;
	        }

	        System.out.println("Hexadecimal number: " + hex);

	        s.close();
	    }
	}