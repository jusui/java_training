import java.awt.event.*;
import java.awt.*;

/**
Lesson.6 自作クラス
 */

public class BaseFrame extends Frame {

    BaseFrame(String name) {
	super(name);

	// setting for window closing button
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
		    System.exit(0);
		}

	    });
    }

    BaseFrame(String name, int width, int height) {
	this(name); // call constructor
	setSize(width, height);
    }
}
