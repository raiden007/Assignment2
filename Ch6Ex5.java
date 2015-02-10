import acm.program.*;
import acm.util.RandomGenerator;

public class Ch6Ex5 extends ConsoleProgram {
	
	int appropiateRange = 20;
	
	public void run() {
		rgen.setSeed(2);
		exerciseFive();
	}
	
	private void exerciseFive() {
		int nrOfQuestions = 5;
		String operation = operationRandom();
		int firstNumber=numberRandom();
		int secondNumber=numberRandom();
		int result;
		
	//	while (firstNumber-secondNumber<0) {
	//		firstNumber=numberRandom();
	//		secondNumber=numberRandom();
	//	}

		if (operation=="+") {
			result = firstNumber+secondNumber;
		} else {
			result = firstNumber-secondNumber;
		}
		
		println(firstNumber);
		println(secondNumber);
		println(operation);
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