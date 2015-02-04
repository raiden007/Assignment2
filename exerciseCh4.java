
import acm.program.ConsoleProgram;
 
public class exerciseCh4 extends ConsoleProgram {
	
	private static final int SENTINEL = -1;
	
	public void run () {
		exerciseSeven();
	}

	/* As a way to pass the time on long bus trips, young people growing up in the United States have been known to sing the following rather repetitive song:
	*99 bottles of beer on the wall.
	*99 bottles of beer.
	*You take one down, pass it around. 98 bottles of beer on the wall.
	*98 bottles of beer on the wall. . . .
	*Anyway, you get the idea. Write a Java program to generate the lyrics to this song.
	*(Since you probably never actually finished singing it, you should decide how you want the song to end.) 
	*In testing your program, it would make sense to use some constant other than 99 as the initial number of bottles.
	*/
	private void exerciseOne () {
		for (int i = 99 ; i > 0; i--) {
			println (i + " bottles of beer on the wall.");
			println (i + " bottles of beer.");
			println ("You take one down, pass it around.");
			println ((i-1) + " bottles of beer on the wall.");
			println ();
		}
		println ("And we are done.");
	}
	
	/* While we’re on the subject of silly songs, another old standby is “This Old Man,” for which the first verse is
	*This old man, he played 1.
	*He played knick-knack on my thumb. With a knick-knack, paddy-whack, Give your dog a bone.
	*This old man came rolling home.
	*Each subsequent verse is the same, except for the number and the rhyming word at the end of the second line, which gets replaced as follows:
	*2—shoe 5—hive 3—knee 6—sticks 4—door 7—up to heaven 8—pate 9—spine 10—shin
	*Write a program to display all 10 verses of this song.
	*/
	private void exerciseTwo () {
	//	String word;
		for (int i = 1 ; i <= 10 ; i++) {
			String word = null;
			if (i==1) word = "thumb";
			if (i==2) word = "shoe";
			if (i==3) word = "knee";
			if (i==4) word = "door";
			if (i==5) word = "hive";
			if (i==6) word = "sticks";
			if (i==7) word = "up to heaven";
			if (i==8) word = "pate";
			if (i==9) word = "spine";
			if (i==10) word = "shin";
			println("The old man, he played 1.");
			println("He played knick-knack on my " + word + ".");
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("This old man came rolling home.");
			println();
				
		}
	}
	
	/* Write a program that reads in a positive integer N and then calculates and displays the sum of the first N odd integers. 
	 * For example, if N is 4, your program should display the value 16, which is 1 + 3 + 5 + 7.
	 */
	private void exerciseThree () {
		int nrOfIntegers = readInt("Enter number of integers: ");
		int oddNumbers = -1;
		int sum = 0;
		for (int i=1; i <= nrOfIntegers; i++) {
			oddNumbers = oddNumbers + 2;
			sum = sum + oddNumbers;
			
		}
		println("The sum of the first " + nrOfIntegers + " odd numbers is " + sum + " .");
	}
	// It appears it computed the squared of the number :)
	
	// Write a program that displays the integers between 1 and 100 that are divisible by either 6 or 7.
	 private void exerciseFour () {
		 for (int i=1; i <= 100; i++) {
			 if ((i%6 == 0) || (i%7 == 0)) {
				 println(i);
			 }
		 }
	 }
	 
	 //Repeat exercise 4, but this time have your program display only those numbers that are divisible by 6 or 7 but not both.
	 private void exerciseFive () {
		 for (int i=1; i <= 100; i++) {
			 // If the number is divisibile by 6 or 7 BUT they are not divisibile by 6 and 7.
			 if (((i%6 == 0) || (i%7 == 0)) != ((i%6==0) && (i%7==0))) {
				 println(i);
			 }
		 }
	 }
	 // Amazingly it works :)

	 /* Using the AddIntegerList program from Figure 4-5 as a model, write a program called AverageList that reads in a list of integers representing exam scores and then prints out the average. 
	  * Because some unfortunate student might actually get a score of 0, your program should use –1 as the sentinel to mark the end of the input.
	  */
	 
	 private void exerciseSix () {
		 println("This program prints the average of grades.");
		 println("Enter values, one per line, using "+ SENTINEL);
		 println("to signal the end of the list.");
		 int total = 0;
		 int nrOfGrades = 0;
		 int average = 0;
		 while (true) {
			 int value = readInt(" ? ");
			 if (value == SENTINEL) break;
			 total += value;
			 nrOfGrades++;
			 average = total / nrOfGrades;
		 }
		 println("The average is "+ average + ".");
		 
	 }
	 
	 /*Rewrite the DigitSum program given in Figure 4-6 so that instead of adding the digits in the number, 
	  * it generates the number that has the same digits in the reverse order, as illustrated by this sample run:
	  */
	 private void exerciseSeven () {
	        println ("This program reverses the digits in an integer.");
	        int n = readInt ("Enter a positive integer: ");
	        print("The reverse of the digits is ");
	        while (n > 0) {
	            int nReversed = 0;
	            nReversed = nReversed + (n % 10);
	            n = n + (n/10);
	            print (nReversed);
	        }
		   
	 }
}
