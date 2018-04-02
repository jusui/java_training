/*
発展課題
9.数式( 1 + (1/n)) ^ n の値は，nの値が大きくなるとネイピア数eに収束する。
nの値を1から100まで変化させた時の値を出力するプログラムを作成せよ。
*/
import static java.lang.System.*;

public class Exer9 {
    public static void main(String[] args) {
	
	for ( int i = 0; i <= 100; i++ ) {
	    double e0 = 1.0 + ( 1.0 / i );
	    double e  = 1.0;
	    for ( int j = 0; j < i; j++ ) {
		e *= e0;
	    }
	    out.println(e);
	}
    }
}
