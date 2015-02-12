import acm.graphics.*;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;


public class graphics extends GraphicsProgram {
	public void run () {
		GObject rect = new GRect(100,100,100,100);
		rect.setFilled() = true;
		add (rect);
	}
}
