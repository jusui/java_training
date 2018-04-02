// break
import static java.lang.System.*;

public class Example6 {
    public static void main(String[] args) {
	int sum = 0;
	for ( int i = 0; i <= 10; i++ ) {
	    sum += i;
	    System.out.println(i + "を加えました.");
	    if ( sum > 20 ) {
		System.out.println("合計が20を超えた");
		break;
	    }
	}
	System.out.println("合計は" + sum );
    }
}
