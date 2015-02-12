import acm.graphics.*;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;


public class graphics extends GraphicsProgram {
	public void run () {
		GObject rect = new GRect(0,0,100,100);
		add (rect);
	}
}
