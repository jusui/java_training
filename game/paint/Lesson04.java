import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.Vector;
import java.util.ArrayList;
    
/**
Lesson. 4 描画を維持する
 */

@SuppressWarnings("serial")
public class Lesson04 extends Applet implements MouseListener, MouseMotionListener {

    // 図形保管用
    Vector shapes = new Vector();
    // List<Integer> shape = new ArrayList<Integer>();
    // Vector<Integer> shapes = new Vector<Integer>();
    
    // coordinator
    int x1, y1;

    //
    Rectangle r = new Rectangle(x1, y1, x1, y1);

    public Lesson04 () {
	setForeground(Color.red);
	setBackground(Color.white);
	addMouseMotionListener(this);
	addMouseListener(this);
    }

    //
    // mousePressed	マウスボタンを押した際の処理
    //
    public void mousePressed(MouseEvent e) {
	// このイベントを消費して、発生させたソースによりデフォルトの方法で処理されないようにします。
	e.consume();
	x1 = e.getX();
	y1 = e.getY();
	Rectangle v_press = new Rectangle(x1, y1, x1, y1);
	shapes.addElement(v_press);
	//	shapes.addElement(new Rectangle(x1, y1, x1, y1));

	paint(getGraphics());
    }

    //
    // mouseDragged
    //
    public void mouseDragged(MouseEvent e) {
	e.consume();

	Rectangle v_dragged = new Rectangle(x1, y1, x1, y1);
	shapes.addElement(v_dragged);
	//	shapes.addElement(new Rectangle(x1, y1, e.getX(), e.getY() ));	
	// 新しい始点を定義
	x1 = e.getX();
	y1 = e.getY();
	
	paint(getGraphics());	
    }

    //
    // mouseMoved
    //
    public void mouseMoved(MouseEvent e) {
    }
	
    //
    // mouseReleased
    //
    public void mouseReleased(MouseEvent e) {
    }
	
    //
    // mouseEntered
    //
    public void mouseEntered(MouseEvent e) {
    }
	
    //
    // mouseExited
    //
    public void mouseExited(MouseEvent e) {
    }
	
    //
    // mouseClicked
    //
    public void mouseClicked(MouseEvent e) {
    }
	
    //
    // paint
    //
    public void paint(Graphics g) {
	
	int number = shapes.size();
	for ( int i = 0; i < number; i++ ) {
	    Rectangle data = (Rectangle)shapes.elementAt(i);
	    g.drawLine(data.x, data.y, data.width, data.height);
	}
    }
	
}
