import static java.lang.System.*;
import java.io.*;
import java.util.*;

/*
文字を検索する
int indexOf(int ch) : 引数の文字が最初に出現する位置を返す
*/

class Sample10_3 {
    public static void main(String[] args) throws IOException {
	out.println("Input Strings!");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str1 = br.readLine();
	out.println("Input search strings");

	String str2 = br.readLine();
	char ch = str2.charAt(0); // 検索したい1文字を返す

	int num = str1.indexOf(ch); // 1文字目が最後に出現する位置を返す

	// 0番目なので (num + 1), 文字れが見つからなかった場合-> -1
	if ( num != -1 )
	    out.println(str1 + "の" + (num + 1) +
			"番目に [" + ch + "] が見つかりました。");
	else
	    out.println(str1 + "に[" + ch + "]がありません。");
    }
}
