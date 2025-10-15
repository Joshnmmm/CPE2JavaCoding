package FruitJuiceMachine;

public class ClassRegister {
	
	private int cashOnHand; 
	
	public ClassRegister() {
		cashOnHand = 500; 
	}
	
	public ClassRegister(int cashIn) {
		cashOnHand = cashIn; 
	}
	
	/////////////////
	public int getCurrentBalance() {
		return cashOnHand; 
	}
	
	public void acceptAmount(int amountIn) {
		cashOnHand += amountIn; 
	}
	

}
