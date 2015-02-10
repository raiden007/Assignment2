import acm.program.*;
import acm.util.RandomGenerator;

public class Ch6Ex5Ex6 extends ConsoleProgram {
	
	int minRange = 0;
	int maxRange = 20;
	int nrOfQuestions = 5;
	
	public void run() {
		// Seed 5 tests that the result is less than zero
		// Seed 1012121 tests that the result is greater than 20(max Range)
	//	rgen.setSeed(1012121);
		exerciseFive();
	}
	
	private void exerciseFive() {
		println ("Welcome to Math Quiz!");
			
		for (int j=0; j<nrOfQuestions; j++) {
			String operation = operationRandom();
			int firstNumber=numberRandom();
			int secondNumber=numberRandom();
			int result;
			
	//		println("Initialized 1st number: " + firstNumber);
	//		println("Initialized 2nd number: " + secondNumber);
			
			if (operation=="+") {
				while (firstNumber+secondNumber>maxRange) {
					firstNumber=numberRandom();
					secondNumber=numberRandom();
	//				println("Check it's not greater than 20: " + firstNumber);
	//				println("Check it's not greater than 20: " + secondNumber);
				}
				result = firstNumber+secondNumber;
			} else {
				while (firstNumber-secondNumber<minRange) {
					firstNumber=numberRandom();
					secondNumber=numberRandom();
	//				println("Check it's not less than zero: " + firstNumber);
	//				println("Check it's not less than zero: " + secondNumber);
				}
				result = firstNumber-secondNumber;
			}
			
	//		println("Last check: "+firstNumber);
	//		println("Last check: "+secondNumber);
	//		println(operation);
	//		println(result);
			
			println("");
			int userResult = readInt("What is "+firstNumber+" "+operation+" "+secondNumber+" ? ");
			if (userResult==result) {
				println(gzRandom());
			} else {
				int tries=0;
					while (tries<3) {
						int newUserResult = readInt ("That's incorrect - try a different answer: ");
						if (newUserResult==result) {
							println(gzRandom());
							tries=3;
						} else {
							tries++;	
						}
					}
						println("Wrong answer");
				}
		}
		
		println("");
		println("Thanks for playing!");
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
	
	private String gzRandom() {
		String message = "";
		int number = rgen.nextInt(0,5);
		if (number==0) {
			message = "Gz!";
		} else if (number==1) {
			message = "Congrats!";
		} else if (number==2) {
			message = "You're awesome!";
		} else if (number==3) {
			message = "Wow you are good!";
		} else if (number==4) {
			message = "Nice!!!";
		} else {
			message = "All right, all right, all right!";
		}
		println("");
		return message;
	}
	
}
