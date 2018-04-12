import java.util.Scanner;
import static java.lang.System.*;

public class Scanner_class {
    public static void main(String[] args) {
	
	// 数値
	Scanner s = new Scanner(System.in);
	out.println("2つの整数の和を計算します。");
	out.println("1つ目の整数を入力して下さい。");
	int a = s.nextInt(); // nextDouble()
	out.println("2つ目の整数を入力して下さい。");
	int b = s.nextInt();
	int sum = a + b;
	out.println("和= " + sum);

	// 文字列
	out.println("文字列を入力して下さい。");
	String str = s.next();
	out.println("入力した文字列は: " + str);

	// 終了処理に用いる場合
	int[] array = new int[10];
	int count = 0;
	while ( count < array.length ) {
	    out.println(count + "番目の整数を入力して下さい。" +
			"[999]を入力すると終了します。");
	    int i = s.nextInt();
	    if ( i == 999 ) break;
	    array[count] = i;
	    count++;
	}
	out.println("入力の受付を終了しました。全部で" + count
		    + "個の値を受付ました。");
    }
}
