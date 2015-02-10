import acm.program.*;
import acm.util.RandomGenerator;

public class Ch6Ex5 extends ConsoleProgram {
	
	int minRange = 0;
	int maxRange = 20;
	int nrOfQuestions = 5;
	
	public void run() {
		// Seed 5 tests that the result is less than zero
		// Seed 13121 tests that the result is greater than 20(max Range)
		rgen.setSeed(13121);
		exerciseFive();
	}
	
	private void exerciseFive() {
		
		String operation = operationRandom();
		int firstNumber=numberRandom();
		int secondNumber=numberRandom();
		int result;
		
		while (firstNumber-secondNumber<minRange) {
			firstNumber=numberRandom();
			secondNumber=numberRandom();
		}
		
		while (firstNumber+secondNumber>maxRange) {
			firstNumber=numberRandom();
			secondNumber=numberRandom();
		}

		if (operation=="+") {
			result = firstNumber+secondNumber;
		} else {
			result = firstNumber-secondNumber;
		}
		
		println(firstNumber);
		println(secondNumber);
		println(operation);
		println(result);
		
		println ("Welcome to Math Quiz!");
		for (int i=0; i<nrOfQuestions; i++) {
			int userResult = readInt("What is "+firstNumber+" "+operation+" "+secondNumber+" ? ");
	//		int userResult = readInt("");
			if (userResult==result) {
				println("Correct!");
			} else {
				int tries=0;
					while (tries<3) {
						int newUserResult = readInt ("That's incorrect - try a different answer: ");
						if (newUserResult==result) {
							println("Correct!");
							tries=3;
						} else {
							tries++;	
						}
					}			
				}
		}
		
		
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
