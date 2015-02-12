import java.awt.Color;

import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;


public class graphics extends GraphicsProgram {
	public void run () {
		GObject rect = new GRect(100,100,100,100);
		rect.setColor(Color.RED);
		add (rect);
	}
}
