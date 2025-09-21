package defaultt;
import java.util.Scanner; 
public class dayOfTheWeek {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = s.nextInt();

		System.out.print("Enter month (1-12): ");
		int month = s.nextInt();

        System.out.print("Enter the day of the month (1-31): ");
        int day = s.nextInt();
        
        
        int adjustedMonth = month;
		if(adjustedMonth == 1) {
			adjustedMonth = 13; 
			year-=1; 
		}
		else if(adjustedMonth == 2) {
			adjustedMonth = 14; 
			year-=1; 
		}
		
		int century = year/100; 
		int yearOfCentury = year%100; 
		
		
		int dayIndex = (day+ (26 * (adjustedMonth + 1)) / 10 + yearOfCentury + (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7; 
		
		switch (dayIndex) {
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
		s.close(); 
	}

}
