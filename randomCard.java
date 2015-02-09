import acm.program.*;
import acm.util.*;


public class randomCard extends ConsoleProgram {
	public void run () {
		int cardNumber = cardNumber();
		if (cardNumber==1) {
			println ("Your card is Ace");
		} else if (cardNumber==11){
			println ("Your card is Jack");
		} else if (cardNumber==12) {
			println("You card is Queen");
		} else if (cardNumber==13) {
			println("Your card is King");
		} else {
			println("Your card is "+cardNumber);
		}
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
