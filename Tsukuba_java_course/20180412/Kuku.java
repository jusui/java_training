import static java.lang.System.*;

/*
九九の計算
*/

public class Kuku {
    public static void main(String[] args) {
	for ( int i = 1; i <= 9; i++ ) {
	    for ( int j = 1; j <= 9; j++ ) {
		// out.println("九九一覧");
		out.println( i + "*" + j + " = " + (i * j) + " " );
	    }
	    out.println();
	}
    }
}
