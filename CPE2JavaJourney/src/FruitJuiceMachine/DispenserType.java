package FruitJuiceMachine;

public class DispenserType {
	
	private int numberOfItems; 
	private int cost; 
	
	
	DispenserType(){
		numberOfItems = 50; 
		cost = 50; 
	}
	
	
	DispenserType(int setNoOfItems, int setCost){
		numberOfItems = setNoOfItems; 
		cost = setCost; 
	}
	
	int getNoOfItems() {
		return numberOfItems; 
	}
	
	int getCost() {
		return cost; 
	}
	
	int makeSale() {
		return numberOfItems -= numberOfItems; 
	}
	
	
}
