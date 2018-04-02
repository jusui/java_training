/*
紙を1回折ると厚さは2倍になり，2回折ると4倍になる。新聞紙を折った回数をNとした時，
その厚さを出力するプログラムを作成せよ。
ただし，新聞紙をの厚さを0.1mm, 富士山の高さを3776mとし，
富士山の高さを超えた時点で出力を終了とする
*/
import static java.lang.System.*;

public class Exer7 {
    public static void main(String[] args) {
	double thick = 0.1; // mm
	int N = 0; // 紙を折った回数
	double Fuji = 3776 * 1000;

	// while(true) {
	//     if ( thick > Fuji ) break;
	//     // 1回折る
	//     N++;
	//     thick *= 2;
	//     out.println("新聞紙を" + N + "回折った時の厚さは" + thick);
	// }

	while( thick < Fuji ) {
	    // 1回折る:N++して，厚さを2倍にする
	    N++;
	    thick *= 2;
	    out.println("新聞紙を" + N + "回折った時の厚さは" + thick);
	}

	// for (double t = 0.1; t < 3776 * 1000; t *= 2 ) {
	//     out.println("新聞紙を" + N + "回折った時の厚さは" + thick);
	//     N++;
	// }
	
    }
}
