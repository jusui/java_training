import java.util.*;
import static java.lang.System.*;

/**
入力した都市名を重複させずにソートして出力

TreeSet : 要素をソートして格納
http://java.keicode.com/lib/collections-set.php
 */

public class Exercise13_1 {
    public static void main(String[] args) {

	
	// sortした
	TreeSet<String> ts = new TreeSet<String>();
	Scanner scan = new Scanner(System.in);

	// out.println("入力する都市名の数を入れて下さい。");	
	// int num = scan.nextInt();
	// String str[] = new String[num];
	
	// for (int i = 1; i <= str.length; i++ ) {
	//     out.println(i + ", " + str[num]);
	// }
	
	System.out.println("都市名1を入力して下さい＞");
	String city1 = scan.next();
	ts.add(city1);

	System.out.println("都市名2を入力して下さい＞");
	String city2 = scan.next();
	ts.add(city2);

	System.out.println("都市名3を入力して下さい＞");
	String city3 = scan.next();
	ts.add(city3);

	Iterator<String> it = ts.iterator();
	// Iterator.hasNext() : 次のデータがある場合に真
	while ( it.hasNext() ) {
	    // Iterator.next() 次のデータを取得
	    out.println(it.next());
	}
    }
}
