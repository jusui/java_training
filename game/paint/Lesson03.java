import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.Vector.*;

/**
Lesson. 4 描画を維持する
 */

public class Lesson03 extends Applet implements MouseListener, MouseMotionListener {

    // 図形保管用
    Vector shapes = new Vector();
    
    // coordinator
    int x1, y1;
    int x2, y2;

    public Lesson03 () {
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
	x1 = x2 = e.getX();
	y1 = y2 = e.getY();
	paint(getGraphics());
    }

    //
    // mouseDragged
    //
    public void mouseDragged(MouseEvent e) {
	e.consume();

	x2 = e.getX();
	y2 = e.getY();
	paint(getGraphics());

	// 新しい始点を定義
	x1 = e.getX();
	y1 = e.getY();
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
	g.drawLine(x1, y1, x2, y2);
	shapes.addElement(x1);
	shapes.addElement(y1);
	shapes.addElement(x2);
	shapes.addElement(y2);
	data = (int)shapes.elementAt(i);
	Rectangle r = new Rectangle(x1, y1, x2, y2);
    }
	
}
