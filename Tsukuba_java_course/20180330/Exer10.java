/*
発展課題
10.フィボナッチ数列F(n)の値をn=2 ~ 10まで出力するプログラムを作成せよ
F(1) = F(2) = 1
F(n+2) = F(n+1) + F(n) (n >= 1)
*/
import static java.lang.System.*;

public class Exer10 {
    public static void main(String[] args) {

	int f_2 = 0; // 2個前の数列
	int f_1 = 1; // 1個前の数列
	for ( int n = 2; n <= 10; n++ ) {

	    // Fibonacci 数列定義
	    int f_n = f_1 + f_2;
	    out.println("n =" + n + ",  F(n) =" + f_n);
	    f_2 = f_1; // 1つ前の数列を代入
	    f_1 = f_n; // 
	}
    }
}
