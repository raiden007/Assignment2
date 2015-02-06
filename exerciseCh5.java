import acm.program.ConsoleProgram;
 
public class exerciseCh5 extends ConsoleProgram {
	public void run () {
//		exerciseOne();
//		exerciseTwo();
//		exerciseThree();
//		exerciseFour();
//		exerciseFive();
		exerciseSix();
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
		for (int k1=-4;k1<5;k1++) {
			println ("Pi at power " +k1 + " is: " + raiseRealToPower(3.14,k1));
		}

	}
	
	private double raiseRealToPower (double x, int k) {
		double result=1;
		double fraction = 1;
		if (k<0) {
			for (int i=0;i>k;i--) {
				fraction = (int) fraction * x;
//				println("fraction:"+fraction);
				result = 1 / fraction;
//				println("result:"+result);
			}
			
		} else {
			for (int i=0;i<k;i++) {
				result = (int) result * x;
//				println(result);
			}
		}
		return result;
	}
	
	private void exerciseSix() {
		println("This program returns the number of digits in a number");
		int n = readInt("Enter number: ");
		println ("The sum of the digits is "+nDigits(n));
	}
	
	private int nDigits (int n) {
		int dsum = 0;
		while (n>0) {
			dsum += n % 10;
			n /= 10;
		}
		return dsum;
	}

}
