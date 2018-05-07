// import java.util.Scanner;
import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
問題１（配列）
入力された2つの数の和を出力するプログラムを作成しなさい。
*入力する数は、共に整数とする。
*負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。

入力例：
5 4

出力例：
9
*/

class Array_sum {
    public static void main(String[] args) throws Exception {
	// Scanner s = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input = br.readLine();
	String[] word = input.split(" "); // inputを空白で分解
	
	int num1 = Integer.parseInt(word[0]);
	int num2 = Integer.parseInt(word[1]);	
	out.println(num1 + num2);
    }
}
