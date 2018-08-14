/*** 
String str1 が str2 の並び替えかを判別 
*/
import java.util.Scanner;
import java.util.Arrays;

//(1.2)順列チェック
class DS_1_2 {
    // sort method
    public static String sort(String s) {
	// toCharArray() : String型からchar型へ変換
	char[] content = s.toCharArray(); 
	Arrays.sort(content);
	return new String(content);
    }

    // permutation (順列) method
    public static boolean permutation(String s, String t) {
	if ( s.length() != t.length() ) {
	    return false;
	}
	return sort(s).equals(sort(t));
    }
    
    public static void main(String[] args) {
	
	Scanner scan1 = new Scanner(System.in);
	System.out.print("Input string 1 > ");
	String str1 = scan1.next();

	Scanner scan2 = new Scanner(System.in);	
	System.out.print("Input string 2 > ");	
	String str2 = scan2.next();
	
	System.out.println(permutation(str1, str2));
    }
}
