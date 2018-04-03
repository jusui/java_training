import static java.lang.System.*;

/*
引数：double value
戻り値の型：double
引数で渡されたvalue の値の絶対値を返す。
*/

public class Test2 {

    public static int getAbsoluteValue() {
	int i = (int)(Math.random() * 100) + 1;
	return i;
    }
    
    public static void main(String[] args) {
	out.println( getRandomNumber() );
    }
}
