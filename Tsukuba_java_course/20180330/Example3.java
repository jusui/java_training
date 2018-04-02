/*
3. xの値を-10から10まで1ずつ変化させたときの次の式
の値を求める。
x^2 - 2x - 1
*/
public class Example3 {
    public static void main(String[] args) {
	for ( int x = -10; x <= 10; x++ ) {
	    System.out.println(x * x - 2 * x - 1);
	}
    }
}
