// class を作ってみよう

import static java.lang.System.*;

class Point {
    // インスタンス変数
    int x;
    int y;
}

public class Test {
    public static void main(String[] args) {

	// Point classのインスタンスを作成し，変数pに参照を代入する
	Point p = new Point();
	p.x = 5;
	p.y = 10;

	Point p2 = new Point();
	p2.x = 5;
	p2.y = 2;
	
	out.println("p.x = " + p.x);
	out.println("p.y = " + p.y);
	out.println("p2.x = " + p2.x);
	out.println("p2.y = " + p2.y);		
    }
}
