import java.util.*;
import static java.lang.System.*;

/**
最小値から最大値までの合計値を求める

ArrayList : 可変サイズリスト
 */

public class Exercise13_2 {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Min value > ");
	int min = scan.nextInt();
	System.out.println("Max value > ");
	int max = scan.nextInt();	

	List<Integer> list = new ArrayList<Integer>();
	for ( int i = min; i <= max; i++ ) {
	    list.add(new Integer(i));
	}

	int sum = 0;
	// 拡張 for文でloop
	// for ( Integer i: list ) {
	//     sum += i.intValue();
	// }

	Iterator<Integer> iter = list.iterator();
	while ( iter.hasNext() ) {
	    sum += iter.next().intValue();
	}
	
	out.println("<Sum> " + sum);
    }

}
