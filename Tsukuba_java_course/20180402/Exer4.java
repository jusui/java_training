import static java.lang.System.*;

/* Exercies.4
1. 始点(5, 4), 終点(13, 9)の線分をLineクラスのインスタンスで表現せよ。
2. 始点ー終点間の長さdを求めよ。
*/

class Point {
    int x;
    int y;
}

class Line {
    Point p0;
    Point p1;
}

public class Exer4 {
    public static void main(String[] args) {
	Line line = new Line(); // line instance
	line.p0 = new Point();
	line.p0.x = 5;
	line.p0.y = 4;
	
	line.p1 = new Point();
	line.p1.x = 13;
	line.p1.y = 9;

	// double d = Math.sqrt( (c - a) * (c - a) + (d - b) * (d - b) );
	double d = Math.sqrt( (line.p1.x - line.p0.x)
			      * (line.p1.x - line.p0.x)
			      + (line.p1.y - line.p0.y)
			      * (line.p1.y - line.p0.y) );
	out.println("線分の長さは: " + d);
	}
}
