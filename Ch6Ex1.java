/* This program shows a random card from a 52 deck of cards
 * and it shows the result.
 */

import acm.program.*;
import acm.util.*;


public class Ch6Ex1 extends ConsoleProgram {
	public void run () {
		// Gets the card number
		int cardNumber = cardNumber();
		// Prints the correct text
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
		// Gets the suite color
		int cardSuite = randomSuite();
		// Prints the next part of the text
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
	
	// Gets a random number as the card number
	private int randomCardNumber() {
		int card = rgen.nextInt (1,13);
		return card;
	}
	
	// Gets a random number between 1-13 to determine the card
	private int cardNumber() {
		int number = randomCardNumber();
	//	println(number);
		return number;
	}
	
	// Gets a random nr between 1-4 to determine the suite
	private int randomSuite() {
		int suite = rgen.nextInt(1,4);
	//	println(suite);
		return suite;
	}
	
	// Constructor for the random generator
	private RandomGenerator rgen = new RandomGenerator();
	
}
