import java.awt.*;
import acm.util.*;
import acm.graphics.*;
import acm.program.*;


public class BouncingBalls extends GraphicsProgram {
	public void run () {
		for (int i=0;i<10;i++) {
			GOval GOval = null;
			GOval circle = GOval;
			circle.setColor(rgen.nextColor());
			int radious = setRandomRadius();

//			setRandomPosition();
//			placeOnMap();
		}
	}
	
	private Object createCircle() {

		return circle;
	}
	
	private int setRandomRadius () {
		int a = rgen.nextInt(5,50);
		println(a);
		return a;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}
