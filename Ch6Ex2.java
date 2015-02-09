import acm.program.*;
import acm.util.*;


public class Ch6Ex2 extends ConsoleProgram {
	public void run () {
//		rgen.setSeed(1);
		int heads=0;
		int tails=0;
		int nrOfFlips=0;
		while (heads<20) {
			String flip = flipCoin();
	//		println("FlipCoin: "+flip);
			nrOfFlips++;
			if (flip=="Heads") {
				heads++;
			} else if (flip=="Tails"){
				tails++;
				heads=0;
			}
	//		println("Heads :"+heads);
	//		println("Tails :"+tails);	
			
		}
		println ("It took "+nrOfFlips+" flips to get "+heads+" consecutive heads.");
		
	}
	
	private String flipCoin() {
		String coinFlip = rgen.nextBoolean() ? "Heads" : "Tails";
		return coinFlip;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
	
}
