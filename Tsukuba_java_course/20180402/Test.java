import static java.lang.System.*;

public class Test{

    // 引数なし
    public static void methodA() {
	out.println("methodA executed! ");
    }
    
    // 
    public static void methodB(int a) {
	out.println("methodB に値" + a + "が渡されました");
    }
    
    // 引数と戻り値のあるメソッド
    // 半径rの円の面積を返す
    public static double getCircleArea(double r) {
	return r * r * Math.PI;
    }
    
    public static void main(String[] args) {
	methodA(); // method Aを呼び出す
	methodB(5); // method Bを呼び出す
	double section = getCircleArea(3.5);
	out.println("円周率 = " + Math.PI);
	out.println("半径3.5の円の面積 = " + section);
    }
}
