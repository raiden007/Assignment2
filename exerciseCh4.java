
import acm.program.ConsoleProgram;
 
public class exerciseCh4 extends ConsoleProgram {
	public void run () {
		exerciseOne();
	}
	
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
}
