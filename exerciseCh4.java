
import acm.program.ConsoleProgram;
 
public class exerciseCh4 extends ConsoleProgram {
	public void run () {
		exerciseThree();
	}

	// We output the song 99 beers on the wall
	private void exerciseOne () {
		for (int i = 99 ; i > 0; i--) {
			println (i + " bottles of beer on the wall.");
			println (i + " bottles of beer.");
			println ("You take one down, pass it around.");
			println ((i-1) + " bottles of beer on the wall.");
			println ();
		}
		println ("And we are done.");
	}
	
	// We change the word on the second line
	private void exerciseTwo () {
	//	String word;
		for (int i = 1 ; i <= 10 ; i++) {
			String word = null;
			if (i==1) word = "thumb";
			if (i==2) word = "shoe";
			if (i==3) word = "knee";
			if (i==4) word = "door";
			if (i==5) word = "hive";
			if (i==6) word = "sticks";
			if (i==7) word = "up to heaven";
			if (i==8) word = "pate";
			if (i==9) word = "spine";
			if (i==10) word = "shin";
			println("The old man, he played 1.");
			println("He played knick-knack on my " + word + ".");
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("This old man came rolling home.");
			println();
				
		}
	}
	
	// Display the sum of x odd integers
	private void exerciseThree () {
		int nrOfIntegers = readInt("Enter number of integers: ");
		int oddNumbers = -1;
		int sum = 0;
		for (int i=1; i <= nrOfIntegers; i++) {
			oddNumbers = oddNumbers + 2;
			sum = sum + oddNumbers;
			
		}
		println("The sum of " + nrOfIntegers + " numbers is= " + sum);
	}
	

}
