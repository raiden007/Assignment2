import acm.program.*;
import acm.util.RandomGenerator;

public class Ch6Ex4 extends ConsoleProgram {
	public void run() {
		int initialAtoms = 10;
		int years = 0;
		int atoms = initialAtoms;
		println("There are "+ initialAtoms+" atoms intially.");
		while (atoms>0) {
			for (int i=0;i<initialAtoms;i++) {
				String atomsDecayed = atomDecayed();
					if (atomsDecayed=="Decayed") {
						atoms--;
				println("Decayed atom");
					} else {
				println("Not decayed");
					}
			}
		initialAtoms = atoms;
		years ++;
		println("There are "+atoms+" at the end of year "+years);
		}
	}
	
	private RandomGenerator rgen = new RandomGenerator();
	
	private String atomDecayed() {
		String decayed = rgen.nextBoolean() ? "Decayed" : "NotDecayed";
		return decayed;
	}
	

	
}
