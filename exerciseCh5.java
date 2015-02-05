import acm.program.ConsoleProgram;
 
public class exerciseCh5 extends ConsoleProgram {
	public void run () {
//		exerciseOne();
//		exerciseTwo();
//		exerciseThree();
//		exerciseFour();
		exerciseFive();
	}
	
	
	private void exerciseOne () {
		double constant = (1+Math.sqrt(5))/2;
		println (constant);
	}
	
	private void exerciseTwo() {
		println ("Enter coeficients for this quadratic equation: ");
		int a = readInt ("a: ");
		int b = readInt ("b: ");
		int c = readInt ("c: ");
		int condition = (int) Math.sqrt((b*b)-(4*a*c));
		int firstSolution;
		int secondSolution;
		if (condition>0) {
			firstSolution = (-b + condition) / (2*a);
			secondSolution = (-b - condition) / (2*a);
			println ("The first solution is "+firstSolution);
			println ("The second solution is "+secondSolution);
		} else {
			println ("The equation has no real solutions.");
		}
	}
	
	private void exerciseThree() {
		int n = readInt ("Enter nr: ");
		fibonacci(n);
		
	}
	
	private int fibonacci(int number) {
		  int firstNum = 0;
		  int secondNum = 1;
		  int total = 0;
//		  println (firstNum);
//		  println(secondNum);
		  for (int i=0; i<number-2; i++) {
			  total = firstNum + secondNum;
			  firstNum = secondNum;
			  secondNum = total;
		  }
		  println(total);
		  return total;
	}
	
	private void exerciseFour() {
		println("This program calculates n at power k.");
		int n = readInt("Enter n: ");
		int k = readInt("Enter k: ");
		println("N at power K is: "+raiseIntToPower(n,k));
		println("The table of 2 at power K is: ");
		for (int i=0;i<10;i++) {
			println(raiseIntToPower(2,i));
		}
	}
	
	private int raiseIntToPower(int n, int k) {
		int result = 1;
		for (int i=0;i<k;i++) {
			result = result*n;
		}
		return result;
	}
	
	private void exerciseFive() {
		println("This program returns X at power K.");
		double x = readDouble("Enter x: ");
		int k = readInt("Enter k: ");
		println ("The result is: "+raiseRealToPower(x,k));
	}
	
	private double raiseRealToPower (double x, int k) {
		double result=1;
		if (k<0) {
			for (int i=0;i>k;i--) {
				double fraction = 1;
				fraction = (fraction*x);
				println("fraction:"+fraction);
				result = 1 / fraction;
				println("result:"+result);
			}
			
		} else {
			for (int i=0;i<k;i++) {
				result = (int) result * x;
			}
		}
		return result;
	}

}
