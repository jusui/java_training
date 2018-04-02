/*
for文の2重ループのを使い，N段の階段図形を出力せよ。ただし，プログラムの冒頭でint N = 5;
のように変数Nの値を変更できるようにすること.
■
■■
■■■
■■■■
■■■■■
*/
import static java.lang.System.*;

public class Exer6 {
    public static void main(String[] args) {
	int N = 5;
	
	for ( int i = 1; i <= N; i++ ) { // 1 ~ N段文の繰り返し 
	    for ( int j = 0; j < i; j++ ) { // 段数と同じだけ■を出力
		out.print("■");
	    }
	    out.println(); // 改行
	}
    }
}
