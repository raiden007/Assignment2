import acm.program.*;
import acm.util.*;


public class Ch6Ex2 extends ConsoleProgram {
	public void run () {
		int heads=0;
		int tails=0;
		int nrOfFlips=0;
		while (heads<3) {
			flipCoin();
			nrOfFlips++;
			println(flipCoin());
			println(heads);
			println(tails);
		}
		println ("It took "+nrOfFlips+"flips to get 3 heads.");
		
	}
	
	private String flipCoin() {
		String coinFlip = rgen.nextBoolean() ? "Heads" : "Tails";
		return coinFlip;
	}
	
	private RandomGenerator rgen = new RandomGenerator();

}
