import acm.program.*;
import acm.util.*;


public class randomCard extends ConsoleProgram {
	public void run () {
		cardNumber();
	}
	
	private int randomNumber() {
		int card = rgen.nextInt (1,13);
		return card;
	}
	
	private int cardNumber() {
		int number = randomNumber();
		println(number);
		return number;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
	
}
