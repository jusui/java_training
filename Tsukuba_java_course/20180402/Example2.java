import static java.lang.System.*;

public class Example2 {

    public static void countdown(int start, int end) {
	for ( int i = start; i >= end; i-- ) {
	    out.println(i);
	}
    }
    
    public static void main(String[] args) {
	countdown(15, 4);
    }
}
