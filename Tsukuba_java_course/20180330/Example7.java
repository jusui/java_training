// continue
import static java.lang.System.*;

public class Example7 {
    public static void main(String[] args) {
	int sum = 0;
	for ( int i = 0; i <= 10; i++ ) {
	    if ( i % 2 == 0 ) continue;
	    sum += i;
	    out.println(i + "を加えました.");
	}
	out.println("合計は " + sum);
    }
}
