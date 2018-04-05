import static java.lang.System.*;

public class Point {
    int x;
    int y;
}

public class Example {

    // public static int getSum(int[] a) {
    // 	int sum = 0;
    // 	for ( int i = 0; i < a.length; i++ ) {
    // 	    sum += a[i];
    // 	}
    // 	return sum;
    // }

    public static void methodA(Point p) {
	out.println(p.x);
	out.println(p.y);
    }

    
    public static void main(String[], args) {
	Point p = new Point(); // instance
	p.x = 10;
	p.y = 20;
	// int[] a = new int[3];
	// a[0] = 10;
	// a[1] = 20;
	// a[2] = 30;
	// out.println(getSum(a));
    }
}
