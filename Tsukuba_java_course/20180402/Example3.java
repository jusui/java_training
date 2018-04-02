import static java.lang.System.*;

// 戻り値
public class Example3 {

    // static : class method
    // それ以外 : instance method
    public static int getSum(int a, int b) {
	return a + b;
    }

    // String[] args : 仮想マシンが読み出す文字列
    public static void main(String[] args) {
	int sum = getSum(5, 8);
	out.println(sum);
    }
}
