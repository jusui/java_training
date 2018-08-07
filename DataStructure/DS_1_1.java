/*** データ構造 */
import java.util.Scanner;

//(1.1)文字列中の重複を判定
class DS_1_1 {
    // ASCII code と仮定
    public static boolean isUniqueChars(String str) {
	if ( str.length() > 128 ) return false;

	boolean[] char_set = new boolean[128];
	for ( int i = 0; i < str.length(); i++ ) {
	    int val = str.charAt(i);
	    if (char_set[val]) { // この文字は既に文字列中に現れている
		return false;
	    }
	    char_set[val] = true;
	}
	return true;    
    }

    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Input string > ");
	String str = scan.next();
	System.out.println(isUniqueChars(str));

    }
}

//(1.2)順列チェック

//(1.3)URLify

//(1.4)回分の順列

//(1.5)一発変換
