import acm.program.*;
import acm.util.*;


public class randomCard extends ConsoleProgram {
	public void run () {
		int cardNumber = cardNumber();
		if (cardNumber==1) {
			print ("Your card is Ace ");
		} else if (cardNumber==11){
			print ("Your card is Jack");
		} else if (cardNumber==12) {
			print("You card is Queen");
		} else if (cardNumber==13) {
			print("Your card is King");
		} else {
			print("Your card is "+cardNumber+" ");
		}
		int cardSuite = randomSuite();
		if (cardSuite==1) {
			print("of Clubs.");
		} else if (cardSuite==2) {
			print("of Diamonds.");
		} else if (cardSuite==3) {
			print("of Hearts.");
		} else {
			print("of Spades.");
		}
		
	}
	
	private int randomCardNumber() {
		int card = rgen.nextInt (1,13);
		return card;
	}
	
	private int cardNumber() {
		int number = randomCardNumber();
	//	println(number);
		return number;
	}
	
	private int randomSuite() {
		int suite = rgen.nextInt(1,4);
	//	println(suite);
		return suite;
	}
	
	
	private RandomGenerator rgen = new RandomGenerator();
	
}
