import acm.program.*;
import acm.util.RandomGenerator;

public class Ch6Ex5 extends ConsoleProgram {
	
	int minRange = 0;
	int maxRange = 20;

	
	public void run() {
		// Seed 5 tests that the result is less than zero
		rgen.setSeed(13);
		exerciseFive();
	}
	
	private void exerciseFive() {
		int nrOfQuestions = 5;
		String operation = operationRandom();
		int firstNumber=numberRandom();
		int secondNumber=numberRandom();
		int result;
		
		while (firstNumber-secondNumber<minRange) {
			firstNumber=numberRandom();
			secondNumber=numberRandom();
		}
		
//		while (firstNumber+secondNumber>maxRange) {
	//		firstNumber=numberRandom();
//			secondNumber=numberRandom();
//		}

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
		int number = rgen.nextInt(1,maxRange);
		return number;
	}
	
	
	
}
