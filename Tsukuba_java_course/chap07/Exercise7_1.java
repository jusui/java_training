import static java.lang.System.*;
import java.io.*;

/**
Exerceise
http://kitako.tokyo/lib/JavaExercise.aspx?id=5 
次のプログラムを作成しなさい。

    10 個の数値を入力する。
    入力された各々の数値を 2 倍にして表示する。
*/

class Exercise7_1 {
    public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader( System.in )); // br instance
	int[] number = new int[5];

	for ( int i = 0; i < number.length; i++ ) {
	    out.println( (i + 1) + "番目の数列を入力して下さい。");
	    number[i] = Integer.parseInt( br.readLine() ); 
	    
	    for ( int j = 0; j < number.length; j++ ) {
		out.println(number[j] * 2);
	    }
	}
	out.println();
    }
}
