/*
2. 1~100までの2または3の倍数を足し算する。ただし12
の倍数は足し算しない。
*/
public class Example2 {
    public static void main(String[] args) {
	int sum = 0;
	for ( int i = 0; i <= 100; i++ ) {
	    if ( (i % 2 == 0 || i % 3 == 0) && i % 12 != 0 ) {
		sum += i;
		System.out.println(i + "を加えました");
	    } 
	}
	System.out.println("合計は " + sum);
    }
}
