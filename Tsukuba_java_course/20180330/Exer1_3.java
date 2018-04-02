/*
10 ~ -10までの整数を大きい順に出力する
*/
import static java.lang.System.*;

public class Exer1_3 {
    public static void main(String[] args) {
	for ( int i = 10; i >= -10; i-- ) {
	    out.println("i :" + i);
	}

	// 同様にwhile()
	int j = 10;
	while ( j >= -10 ) {
	    out.println(j);
	    j--;
	}
    }
}
