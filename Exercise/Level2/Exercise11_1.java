import java.util.*;

/**
入力した文字列が回文かどうかを判定する
 */

public class Exercise11_1 {
    public static void main(String[] args) {
	String str, r_str;
	Scanner scan = new Scanner(System.in);

	// 文字列を書く
	System.out.println("文字列を入力して下さい＞");
	str = scan.nextLine();
	System.out.println(str);

	// StringBufferに読みこむ
	StringBuffer sb, r_sb;
	sb = new StringBuffer(str);
	System.out.println(sb);

	// 文字列を逆から出力する
	r_sb = sb.reverse();
	System.out.println(r_sb);
	r_str = r_sb.toString();
	System.out.println(r_str);
	
	if ( r_str.equals(str) ) {
	    System.out.println(str + "は回文です。");	    	
	} else {
	    System.out.println(str + "は回文ではありません。");	    
	}
	
    }
}
