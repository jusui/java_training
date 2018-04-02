/*
0 ~ 100までに含まれる「7で割り切れる数」を小さい順に出力する
*/
import static java.lang.System.*;

public class Exer1_6 {
    public static void main(String[] args) {
	for ( int i = 0; i <= 100; i++ ) {
	    if ( i % 7 == 0 ) out.println("i % 7 = " + i);
	}

	// 同様にcontinue使い7で割り切れない場合を考える
	for ( int j = 0; j <= 100; j++ ) {
	    if ( j % 7 != 0 ) continue;
	    out.println("j % 7 = "+ j);
	}
	
	// 同様に7ずつ増やす
	for ( int l = 0; l <= 100; l += 7 ) {
	    out.println("l % 7 = "+ l);
	}
    }
}
