import java.awt.*;
import java.applet.*;

/**
Lesson 2. 矩形
 */

public class Lesson02 extends Applet {
    public void paint(Graphics g) {
	setForeground(Color.red);
	for ( int i = 0; i < 300; i += 10 ) {
	    g.drawRect( (300-i) / 2, (300-i) / 2, i/2, i/2);
	}
    }
}
