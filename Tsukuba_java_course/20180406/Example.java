import static java.lang.System.*;

/*
引数で渡された配列とは，並び順が逆の配列を返す.
*/

public class Example {

    public static int[] getInversedArray(int[] array) {
	// int[] arr = new int[2];
	int[] arr = new int[array.length]; // 要素と同じだけの配列が必要

	// 引数で渡された配列の要素の後ろから順番にコピーしていく
	for ( int i = 0; i < array.length; i++ ) {
	    // out.println(array.length);
	    arr[i] = array[(array.length - 1) - i]; // 配列[0, 1..]なのでarray[(5-1) - i]
	}
	return arr;
    }

    public static void main(String[] args) {
	int[] arr_b = {4, 8, 9, 12}; // sortしているわけではない!!
	int[] inversed_b = getInversedArray(arr_b);
	for ( int i = 0; i < inversed_b.length; i++ ) {
	    out.println(inversed_b[i] + " ");
	}
    }
}
