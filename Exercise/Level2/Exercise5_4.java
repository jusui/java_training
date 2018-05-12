import static java.lang.System.*;
import java.util.Scanner;

class Exercise5_4 {

    public static void main(String[] args) {

	// Scanner();
	Scanner scan = new Scanner(System.in);
	
	out.println("Input the length of list");
	int length = scan.nextInt();
	int list[] = new int[length];
	
	for ( int i = 0; i < list.length; i++ ) {
	    out.println("Input an integer");
	    list[i] = scan.nextInt();
	    out.print("Your input number is : ");
	    out.println(list[i]);
	}
    }

}
