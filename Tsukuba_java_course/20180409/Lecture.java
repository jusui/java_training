import java.util.Scanner;
import static java.lang.System.*;

public class Lecture {
    public static void main(String[] args) {
	// instance
	Scanner s = new Scanner(System.in);
	out.println("2つの整数の和を計算します。");
	out.println("Input 1st interger");
	int a = s.nextInt();
	
	out.println("Input 2nd interger");
	int b = s.nextInt();
	
	int sum = a + b;
	out.println("合計は" + sum + "です。");
    }
}
