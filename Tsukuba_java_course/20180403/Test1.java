import static java.lang.System.*;

/*
引数：なし
戻り値の型：int
1 ~ 100までのランダムな整数を表す
*/

public class Test1 {

    public static int getRandomNumber() {
	int i = (int)(Math.random() * 100) + 1;
	return i;
    }
    
    public static void main(String[] args) {
	out.println(getRandomNumber());
    }
}
