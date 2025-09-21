package defaultt;

public class headOrTails {

	public static void main(String[] args) {
		final int TOTAL_FLIPS = 2000000;
        int headsCount = 0;
        int tailsCount = 0;
        
        System.out.println("Flipping a coin 2,000,000 times:");
        
        
        for (int i = 0; i < TOTAL_FLIPS; i++) {
        	int flip = (int)(Math.random() * 2);
            if (flip == 1) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        System.out.println("\nResults:");
        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);
    }
}