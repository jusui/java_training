import java.awt.event.*;
import java.awt.*;
import java.applet.*;

/** 図形処理　お絵かきソフトの作成
Lesson 6. 自分でクラスをつくる
*/

public class Base extends Applet {

    // def panel
    DrawPanel panel;
    Checkbox free;
    Checkbox line;
    
    // init
    // 描画エリア・制御部分の配置
    public void init() {
	setLayout(new BorderLayout());
	panel = new DrawPanel();
	add("Center", panel);

	// Checkbox() でFREE/LINE 選択可能
	CheckboxGroup group = new CheckboxGroup();
	free = new Checkbox("FreeLine",true, group);
	line = new Checkbox("Line",    false,group);
	Panel p = new Panel();
	p.setBackground(Color.white);
	p.add(free);
	p.add(line);
	add("South",p);
	free.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
		    if (free.getState())  {
			panel.setDrawMode(DrawPanel.FREE);
		    }
		}
	    });
	line.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
		    if (line.getState())  {
			panel.setDrawMode(DrawPanel.LINE);
		    }
		}
	    });
    }

    // destroy
    // 描画エリア・制御部分の廃棄
    public void destroy() {
	remove(panel);
    }

    // main
    // アプリケーション用にフレームワークを用意
    public static void main(String[] args) {
	BaseFrame f = new BaseFrame("Test", 300, 300);
	Base base = new Base();
	base.init();
	base.start();
	f.add("Center", base);

	f.setVisible(true);
    }
    
}
