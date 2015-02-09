/* This program flips a coin until you get 3 heads
 * results in a row
 */

import acm.program.*;
import acm.util.*;


public class Ch6Ex2 extends ConsoleProgram {
	public void run () {
//		rgen.setSeed(1);
		int heads=0;
		int tails=0;
		int nrOfFlips=0;
		// Until there are 3 heads we flip a coin
		while (heads<3) {
			String flip = flipCoin();
	//		println("FlipCoin: "+flip);
			nrOfFlips++;
			// Increments heads count if coin is heads
			if (flip=="Heads") {
				heads++;
			// Increments tails count(debug) and resets the heads count
			} else if (flip=="Tails"){
				tails++;
				heads=0;
			}
	//		println("Heads :"+heads);
	//		println("Tails :"+tails);	
			
		}
		// Prints the final result
		println ("It took "+nrOfFlips+" flips to get "+heads+" consecutive heads.");
		
	}
	
	// Flips a coin and gets a result
	private String flipCoin() {
		String coinFlip = rgen.nextBoolean() ? "Heads" : "Tails";
		return coinFlip;
	}
	
	// Random generator constructor
	private RandomGenerator rgen = new RandomGenerator();
	
}
