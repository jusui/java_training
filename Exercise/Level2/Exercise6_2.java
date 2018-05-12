import static java.lang.System.*;
import java.util.Scanner;

class Exercise6_2 {

    public static void putStars(int m, int n) {
	for ( int i = 0; i < m; i++ ) {
	    for ( int j = 0; j < n; j++ ) {
		out.print("*");
	    }
	    out.println();
	}
    }
    
    public static void main(String[] args) {

	// Scanner();
	Scanner scan = new Scanner(System.in);

	out.println("Input the height of stars");
	int  height = scan.nextInt();
	
	out.println("Input the width of stars");
	int width = scan.nextInt();

	putStars(height, width);
	
    }

}
