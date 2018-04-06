import static java.lang.System.*;

/*
インスタンスへの参照
*/
class Point {
    int x;
    int y;
}

public class Example3 {
    public static void methodA(int[] a) {
	a[0] ++; //
    }
    
    public static void main(String[] args) {
	Point p = new Point(); // pの所在地情報を受け取る
	p.x = 10;
	p.y = 10;
	methodA(p); 
	// method 呼び出し後のiの値を確認
	out.println(p.x);
	out.println(p.y);
    }
}
