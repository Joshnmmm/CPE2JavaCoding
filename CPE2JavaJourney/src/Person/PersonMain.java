package Person;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("Josh", 19); 
		Person p2 = new Person("Jaden", 16); 
		Person p3 = new Person("Josh", 9); 
		
		
		System.out.println(p1.bothEqual(p2)); 
		System.out.println(p2.nameEqual(p1));
		System.out.println(p1.nameEqual(p3));
		System.out.println(p1.ageEqual(p2));
		System.out.println(p2.olderAge(p1));
		System.out.println(p1.youngerAge(p2));

	}

}
