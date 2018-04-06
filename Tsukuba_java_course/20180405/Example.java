import static java.lang.System.*;

/*
Chap.7
Instance method, constructor
*/

// 8.
public class Example {

    public static int[] getInversedArray(int[] array) {
	// 入れ物容易
	int[] a = new int[array.length];

	// 引数で渡された配列の要素を後ろから順番にコピーする
	for ( int i = 0; i < array.length; i++ ) {
	    a[i] = array[(array.length - 1) - i];
	}
	return a;
    }

    public static void main(String[] args) {
	// method
	int[] b  = {4, 9, 10, 11};
	int[] b2 = getInversedArray(b);
	for ( int i = 0; i < b2.length; i++ ) {
	    out.println(b2[i] + " ");
	}
    }
}
