package ConstructorPractice;

public class Car {
	int horsePower;
	String engine;
	String type;
	String wheelDrive; 
	
	Car(int horsePower, String engine, String type, String wheelDrive){
		this.horsePower = horsePower; 
		this.engine = engine; 
		this.type = type; 
		this.wheelDrive = wheelDrive; 
		
		
        System.out.println("Horsepower: " + horsePower);
        System.out.println("Engine: " + engine);
        System.out.println("Type: " + type);
        System.out.println("Wheel Drive: " + wheelDrive);
	}
	

}
