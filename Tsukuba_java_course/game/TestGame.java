import java.lang.System.*;
import java.awt.*;
import javax.swing.*;

public class TestGame extends JApplet{
    public void init() {
	// Initialize
	MainPanel pn = new MainPanel(); // MainPanel Object
	getContentPane().add(pn); // MainPanel object を ContentPaneに追加
    }

    public static void main(String[] args) {
	init();
	
    }
}

class MainPanel extends JPanel {
    MainPanel() {
	setBackground(new Color(238, 255, 238)); // 背景色の設定
    }
    public void paintComponent(Graphics g) {
	super.paintComponent(g); // 親クラスの描画

	// get Graphics2D
	Graphics2D g2 = (Graphics2D)g;
	// 線幅が5ピクセルの矩形
	g2.setStroke(new BasicStroke(5.0f));
	g2.draw(new Rectangle(20, 15, 100, 100));
	// 塗りつぶされた円
	g.setColor(Color.green);
	g.fillOval(30, 25, 80, 80);
	// 線幅が5ピクセルの矩形
	g.setColor(Color.red);
	g2.draw(new Rectangle(150, 15, 100, 100));
    }
}


