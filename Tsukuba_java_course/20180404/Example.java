import static java.lang.System.*;

public class Point {
    int x;
    int y;
}

public class Example {

    public static int getSum(int[] a) {
	int sum = 0;
	for ( int i = 0; i < a.length; i++ ) {
	    sum += a[i];
	}
	return sum;
    }
    
    public static void main(String[], args) {
	int[] a = new int[3];
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	out.println(getSum(a));
    }
}
