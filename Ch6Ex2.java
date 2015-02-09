import acm.program.*;
import acm.util.*;


public class Ch6Ex2 extends ConsoleProgram {
	public void run () {
		rgen.setSeed(1);
		int heads=0;
		int tails=0;
		int nrOfFlips=0;
		while (heads<10) {
			flipCoin();
			nrOfFlips++;
			if (flipCoin()=="Heads") {
				heads++;
			} else {
				tails++;
			}
			println("FlipCoin: "+flipCoin());
			println("Heads :"+heads);
			println("Tails :"+tails);
		}
		println ("It took "+nrOfFlips+" flips to get 3 heads.");
		
	}
	
	private String flipCoin() {
		String coinFlip = rgen.nextBoolean() ? "Heads" : "Tails";
		return coinFlip;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
	
}
