import static java.lang.System.*;

/*
メソッドでの配列の参照
*/

public class Example3 {
    public static void methodA(int[] a) {
	a[0] ++; //
    }
    
    public static void main(String[] args) {
	int[] a = new int[2]; // 
	a[0] = 10;
	a[1] = 10;
	methodA(a);

	// method 呼び出し後のiの値を確認
	out.println(a[0]);
	out.println(a[1]);
    }
}
