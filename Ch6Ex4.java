import acm.program.*;
import acm.util.RandomGenerator;

public class Ch6Ex4 extends ConsoleProgram {
	public void run() {
		int initialAtoms = 10000;
		int years = 0;
		int atoms = initialAtoms;
		for (int i=0;i<atoms;i++) {
			String atomsDecayed = atomDecayed();
			if (atomsDecayed=="Decayed") {
				atoms--;
				println(atoms);
			} else {
				println(atoms);
			}
		}
	}
	
	private RandomGenerator rgen = new RandomGenerator();
	
	private String atomDecayed() {
		String decayed = rgen.nextBoolean() ? "Decayed" : "NotDecayed";
		return decayed;
	}
	

	
}
