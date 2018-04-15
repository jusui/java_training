import java.awt.*;
import javax.swing.*;

public class MyAddress extends JFrame{

    // constructor
    public MyAddress() {
	super("My address"); // super() でJFrame を生成
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container pane = getContentPane();
	pane.setLayout( new FlowLayout(FlowLayout.CENTER, 10, 10) );

	pane.add( new JLabel("Junya Usui") );
	pane.add( new JLabel("Yotsuyasaka-machi") );
	pane.add( new JLabel("7-2") );
	pane.add( new JLabel("Daiich-House") );
    }
    
    public static void main(String[] args) {
	new MyAddress();
    }
}
