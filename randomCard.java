import acm.program.*;
import acm.util.*;


public class randomCard extends ConsoleProgram {
	public void run () {
		int cardNumber = cardNumber();
		if (cardNumber==1) {
			println ("Your card is Ace");
		} else if (cardNumber==2){
			println ("Your card is 2");
		} else if (cardNumber==3) {
			println("You card is 3");
		} else if (cardNumber==4) {
			println("Your card is 4");
		} else if (cardNumber==5) {
			println("Your card is 5");
		}
	}
	
	private int randomNumber() {
		int card = rgen.nextInt (1,13);
		return card;
	}
	
	private int cardNumber() {
		int number = randomNumber();
		println(number);
	}
	
	private RandomGenerator rgen = new RandomGenerator();
	
}
