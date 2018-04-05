import static java.lang.System.*;

/*
メソッドの数値の参照
*/

public class Example2 {
    public static void methodA(int i) {
	i++;
	out.println(i); // 
    }
    
    public static void main(String[] args) {
	int i = 10;
	methodA(i);
	// method呼び出し後のiを確認
	out.println(i);
    }
}
