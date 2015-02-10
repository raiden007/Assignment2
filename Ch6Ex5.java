import acm.program.*;
import acm.util.RandomGenerator;

public class Ch6Ex5 extends ConsoleProgram {
	
	int appropiateRange = 20;
	
	public void run() {
		rgen.setSeed(1);
		exerciseFive();
	}
	
	private void exerciseFive() {
		int nrOfQuestions = 5;
		String operation = operationRandom();
		int firstNumber=numberRandom();
		int secondNumber=numberRandom();
		int result;

		if (operation=="+") {
			result = firstNumber+secondNumber;
		} else {
			result = firstNumber-secondNumber;
		}
		
		println(firstNumber);
		println(secondNumber);
		println(result);
		
	}
	
	private RandomGenerator rgen = new RandomGenerator();
	
	private String operationRandom() {
		String operation = rgen.nextBoolean() ? "+" : "-";
		return operation;
		
	}
	
	private int numberRandom () {
		int number = rgen.nextInt(1,appropiateRange);
		return number;
	}
	
	
	
}
