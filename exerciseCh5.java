import acm.program.ConsoleProgram;
 
public class exerciseCh5 extends ConsoleProgram {
	public void run () {
		exerciseOne();
		exerciseTwo();
	}
	
	
	private void exerciseOne () {
		double constant = (1+Math.sqrt(5))/2;
		println (constant);
	}
	
	private void exerciseTwo() {
		println ("Enter coeficients for this quadratic equation: ");
		double a = readDouble ("a: ");
		double b = readDouble ("b: ");
		double c = readDouble ("c: ");
		double condition = Math.sqrt((b*b)-(4*a*c));
		double firstSolution;
		double secondSolution;
		if (condition>0) {
			firstSolution = (-b + condition) / (2*a);
			secondSolution = (-b - condition) / (2*a);
			println ("The first solution is "+firstSolution);
			println ("The second solution is "+secondSolution);
		} else {
			println ("The equation has no real solutions.");
		}
	}
}
