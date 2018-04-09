import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
問題２（分岐／多重分岐）

入力された四則演算の結果を出力するプログラムを作成しなさい。下記が条件。
*入力する数は、すべて整数とする。
*演算記号は「+」(和) 「-」(差) 「*」(積) 「/」(商)を使用する。
*四則演算の式は、1回の演算とし、2回以上の演算は行わない。（正しい：23 * 58 / 誤り: 23 + 58 + 7）

*商を求める際は、余りを「 … N」と表示する
*「0」(ゼロ)で割る式は入力しない
*負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。

入力例
  23 * 58

出力例
  1334
*/

public class Multi_fork {
    public static void main(String[] args) throws Exception { 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// read input parameters
	String input = br.readLine();
	String[] word = input.split(" ");
	int num1 = Integer.parseInt(word[0]);
	String type = word[1];
	int num2 = Integer.parseInt(word[2]);

	if ( type.equals("+") ) {
	    out.println(num1 + num2);
	} else if ( type.equals("-") ) {
	    out.println(num1 - num2);
	} else if ( type.equals("*") ) {
	    out.println(num1 * num2);
	} else if ( type.equals("/")) {
	    out.println(num1 / num2 + " ... " + num1 % num2);
	}
    }
}
