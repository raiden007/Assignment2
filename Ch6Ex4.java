/* This program starts with 10000 atoms. Each cycle (year) each atom has a 50%
 * chance to decay. We determine in how many years all the atoms are decayed.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class Ch6Ex4 extends ConsoleProgram {
	public void run() {
		// Initial state
		int initialAtoms = 10000;
		int years = 0;
		int atoms = initialAtoms;
		println("There are "+ initialAtoms+" atoms intially.");
		// As long as there are atoms we run the program
		while (atoms>0) {
			// For all the atoms from 1 to how many are still active we determine if they will decay this year
			for (int i=0;i<initialAtoms;i++) {
				String atomsDecayed = atomDecayed();
					if (atomsDecayed=="Decayed") {
						atoms--;
		//		println("Decayed atom");
					} else {
		//		println("Not decayed");
					}
			}
		// Update the atoms that are left
		initialAtoms = atoms;
		// Increase the year
		years ++;
		// Print the statement
		println("There are "+atoms+" at the end of year "+years);
		}
	}
	
	// Random generator
	private RandomGenerator rgen = new RandomGenerator();
	
	// Random between 2 values
	private String atomDecayed() {
		String decayed = rgen.nextBoolean() ? "Decayed" : "NotDecayed";
		return decayed;
	}
	

	
}
