import java.awt.Color;
import acm.util.*;
import acm.graphics.*;
import acm.program.*;
import acm.program.GraphicsProgram;


public class graphics extends GraphicsProgram {
	public void run () {
		GRect rect = new GRect(100,100,100,100);
		rect.setColor(Color.RED);
		rect.setFilled(true);
		add (rect);
	}
}
