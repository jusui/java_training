import java.awt.*;
import java.applet.*;

/**
My paint app.
 */

public class Lesson01 extends Applet {
    public void paint(Graphics g) {
	setForeground(Color.red);
	g.drawString("Name", 100, 100);
    }
}
