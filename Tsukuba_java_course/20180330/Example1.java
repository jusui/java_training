/*
1. 1~100までの偶数だけを足し算する
*/
public class Example1 {
    public static void main(String[] args) {
	int sum = 0;
	for ( int i = 0; i <= 100; i++ ) {
	    if ( i % 2 == 0 ) {
		sum += i;
		System.out.println(i + "を加えました");
	    }
	}
	System.out.println("合計は " + sum);
    }
}
