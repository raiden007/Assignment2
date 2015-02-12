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
			int xPosition = setRandomHeightPosition();
			int yPosition = setRandomWidthPosition();
//			println(getWidth());
//			println(getHeight());
			println(xPosition);
			println(yPosition);
//			placeOnMap();
		}
	}
	
	
	private int setRandomRadius () {
		int a = rgen.nextInt(5,50);
		return a;
	}
	
	private int setRandomHeightPosition() {
		int a = rgen.nextInt(0,getHeight());
		return a;
	}
	
	private int setRandomWidthPosition() {
		int a = rgen.nextInt(0,getWidth());
		return a;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}
