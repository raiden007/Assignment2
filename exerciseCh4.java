
import acm.program.ConsoleProgram;
 
public class exerciseCh4 extends ConsoleProgram {
	public void run () {
		exerciseOne();
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
		String word;
		for (int i = 1 ; i <= 10 ; i++) {
			if (i=1) word = "thumb";
			println (i);
				
		}
	}
	

}
