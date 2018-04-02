/*
発展課題
11. a < b < c <= 100を満たすピタゴラス数をすべて求めよ。
ピタゴラス数とは，a*a + b*b = c*c を満たす3つの正整数の組のことである。
e.f. (a, b, c) = (1, 2, 3)
*/
import static java.lang.System.*;

public class Exer11 {
    public static void main(String[] args) {

	for ( int a = 1; a < 100; a++ ) {
	    for ( int b = a + 1; b < 100; b++ ) {
		for ( int c = b + 1; c < 100; c++ ) { // c < a + bも同様
		    if ( a*a + b*b == c*c ) {
			out.println("a = " + a + " b =" + b + " c =" + c);
		    }
		}
	    }
	}
    }
}
