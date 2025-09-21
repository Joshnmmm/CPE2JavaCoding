package defaultt;

public class dayOfTheWeek {

	public static void main(String[] args) {
		int h, q, m, j, k;
		int year = 2016;
		m = 1; 
		q = 20;
		if(m == 1) {
			m = 13; 
			year-=1; 
		}
		else if(m == 2) {
			m = 14; 
			year-=1; 
		}
		j = year/100; 
		k = year%100; 
		
		
		h = (q + 26*(m+1)/10 + k +k/4 + j/4 +5*j)%7; 
		switch (h) {
			case (0):
				System.out.println("Saturday"); 
				break; 
			case (1):
				System.out.println("Sunday"); 
				break; 
			case (2):
				System.out.println("Monday"); 
				break; 
			case (3):
				System.out.println("Tuesday"); 
				break; 
			case (4):
				System.out.println("Wednesday"); 
				break; 
			case (5):
				System.out.println("Thursday"); 
				break; 
			case (6):
				System.out.println("Friday"); 
				break; 
		}
	}

}
