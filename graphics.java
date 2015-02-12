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

		for (int i=0;i<100;i++) {
			pause(1000);
			rect.setVisible(false);
			pause(1000);
			rect.setVisible(true);
		}
	}
}
