import java.awt.*;
import acm.util.*;
import acm.graphics.*;
import acm.program.*;


public class randomCircles extends GraphicsProgram {
	public void run () {
		for (int i=0;i<10;i++) {
			GOval GOval = null;
			GOval circle = GOval;
//			circle.setColor(rgen.nextColor());
			int radious = setRandomRadius();
//			println(radious);
			int xPosition = setRandomPosition();
			int yPosition = setRandomPosition();
			println(getWidth());
			println(getHeight());
//			println(xPosition);
//			println(yPosition);
//			placeOnMap();
		}
	}
	
	
	private int setRandomRadius () {
		int a = rgen.nextInt(5,50);
		return a;
	}
	
	private int setRandomPosition() {
		int a = rgen.nextInt(getWidth(),getWidth());
		return a;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}
