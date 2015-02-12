import java.awt.*;
import acm.util.*;
import acm.graphics.*;
import acm.program.*;


public class randomCircles extends GraphicsProgram {
	public void run () {
		for (int i=0;i<10;i++) {
			GOval GOval = null;
			GOval circle = GOval;
			circle.setColor(rgen.nextColor());
			int radious = setRandomRadius();
			println(radious);

//			setRandomPosition();
//			placeOnMap();
		}
	}
	
	
	private int setRandomRadius () {
		int a = rgen.nextInt(5,50);
		return a;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}
