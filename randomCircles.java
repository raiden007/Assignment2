import java.awt.*;
import acm.util.*;
import acm.graphics.*;
import acm.program.*;


public class randomCircles extends GraphicsProgram {
	public void run () {
		for (int i=0;i<10;i++) {
			int radious = setRandomRadius();
			int xPosition = setRandomWidthPosition();
			int yPosition = setRandomHeightPosition();
//			println(getWidth());
//			println(getHeight());
			GOval circle = new GOval (xPosition,yPosition,radious,radious);
			circle.setColor(rgen.nextColor());
			circle.setFilled(true);
			println(xPosition);
			println(yPosition);
			println(radious);
			add (circle);
		}
	}
	
	
	private int setRandomRadius () {
		int a = rgen.nextInt(5,200);
		return a;
	}
	
	private int setRandomWidthPosition() {
		int a = rgen.nextInt(0,getWidth());
		return a;
	}
	
	private int setRandomHeightPosition() {
		int a = rgen.nextInt(0,getHeight());
		return a;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}
