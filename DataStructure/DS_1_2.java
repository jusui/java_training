/*** データ構造 */
import java.util.Scanner;
import java.util.Arrays;

//(1.2)順列チェック
class DS_1_2 {
    // ASCII code と仮定
    public static String sort(String s) {
	char[] content = s.toCharArray();
	Arrays.sort(content);

    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Input string > ");
	String str = scan.next();
	System.out.println(isUniqueChars(str));

    }
}
