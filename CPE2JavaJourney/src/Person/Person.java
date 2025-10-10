package Person;

public class Person {
	private String name; 
	private int age; 
	
	Person(String name, int age){
		this.name = name; 
		this.age = age; 
	}
	
	String getName() {
		return name; 
	}
	
	int getAge() {
		return age; 
	}
	
	void setName(String name) {
		this.name = name; 
	}
	
	void setAge(int age) {
		this.age = age; 
	}
	

	
	Boolean bothEqual(Person x) {
		return name.equals(x.name) && age == x.age; 
	}
	
	Boolean nameEqual(Person x) {
		return name.equals(x.name); 
	}
	
	Boolean ageEqual(Person x) {
		return age == x.age; 
	}
	
	Boolean olderAge(Person x) {
		return age > x.age;
	}
	
	Boolean youngerAge(Person x) {
		return age < x.age; 
	}
	
	
	
}
