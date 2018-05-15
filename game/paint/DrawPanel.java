import java.awt.event.*;
import java.awt.*;
import java.util.Vector;

/**
Lesson.5
 */
class DrawPanel extends Panel implements MouseListener, MouseMotionListener {

    // 図形保管用    
    Vector shapes = new Vector();

    // start
    int x1, y1;
    public static final int FREE = 0;
    public static final int LINE = 1;
    int mode = FREE;
    // end
    int x2, y2;
    // new start = old end
    int x3, y3;

    public DrawPanel() {
	setForeground(Color.red);
	setBackground(Color.white);
	addMouseMotionListener(this);
	addMouseListener(this);
    }

    // set writing mode(Free / Line)
    public void setDrawMode(int mode) {
	switch(mode) {
	case FREE:
	case LINE:
	    this.mode = mode;
	    break;
	default:
	    break;
	}
    }

    // マウスボタンを押した時の処理
    public void mousePressed(MouseEvent e) {
	e.consume();
	// switch writing mode
	switch(mode) {
	case FREE:
	    x1 = e.getX();
	    y1 = e.getY();
	    shapes.addElement(new Rectangle(x1, y1, x1, y1));
	    paint(getGraphics());
	    break;
	case LINE:
	    x1 = e.getX();
	    y1 = e.getY();
	    x2 = -1; // flag
	    break;
	default:
	    break;
	}
    }

    // マウスドラッグの際の処理
    public void mouseDragged(MouseEvent e) {
	e.consume();
	switch(mode) {
	case FREE:
	    shapes.addElement(new Rectangle(x1, y1, e.getX(), e.getY()));
	    x1 = e.getX();
	    y1 = e.getY();
	    break;
	case LINE:
	    x3 = x2;
	    y3 = y2;
	    x2 = e.getX(); // 終点
	    y2 = e.getY(); // 終点
	    break;
	default:
	    break;
	}
	paint(getGraphics());
    }

    // mouseMoved
    //      マウス移動の際の処理（未設定）
    public void mouseMoved(MouseEvent e)  {
    }
    
    // mouseReleased
    //      マウスボタンを離した際の処理（未設定）
    public void mouseReleased(MouseEvent e) {
	e.consume();
	switch(mode) {
	case FREE:
	    break;
	case LINE:
	    shapes.addElement(new Rectangle(x1, y1, e.getX(), e.getY()));
	    break;
	default:
	    break;
	}
	paint(getGraphics());
    }
    
    // mouseEntered
    //      コンポーネントにマウス侵入の際の処理（未設定）
    public void mouseEntered(MouseEvent e)  {
    }
    
    // mouseExited
    //      コンポーネントからマウス脱出の際の処理（未設定）
    public void mouseExited(MouseEvent e) {
    }
    
    // mouseClicked
    //      マウスクリックの際の処理（未設定）
    public void mouseClicked(MouseEvent e)  {
    }

    // paint
    //      描画処理
    public void paint(Graphics g) {
	int number = shapes.size();
	for (int i = 0;i < number;i++)  {
	    Rectangle data = (Rectangle)shapes.elementAt(i);
	    g.drawLine(data.x,data.y,data.width,data.height);
	}

	if ( mode == LINE ) {
	    g.setColor(getBackground());
	    if ( x3 != -1 ) {
		g.drawLine(x1, y1, x3, y3);
	    }
	    g.setColor(getForeground());
	    if ( x2 != -1 ) {
		g.drawLine(x1, y1, x2, y2);
	    }
	}
    }
    
}
