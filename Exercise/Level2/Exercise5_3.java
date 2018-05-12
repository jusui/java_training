import static java.lang.System.*;
import java.util.Scanner;

class Exercise5_3 {

    public static void main(String[] args) {

	// Scanner();
	Scanner scan = new Scanner(System.in);
	
	int list[] = new int[5];
	
	for ( int i = 0; i < list.length; i++ ) {
	    out.println("Input an integer");
	    list[i] = scan.nextInt();
	    out.print("Your input number is : ");
	    out.println(list[i]);
	}
    }

}
