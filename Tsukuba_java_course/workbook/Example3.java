import static java.lang.System.*;

public class Example3 {

    public static void printRandomMessage() {

	int n = (int)(3 * Math.random());
	out.println(n);
	if ( n == 0 )
	    out.println("こんばんわ");
	else if ( n == 1 )
	    out.println("こんにちは");
	else
	    out.println("おはよう");
	
    }
    
    public static void main(String[] args) {
	printRandomMessage();
    }
}
