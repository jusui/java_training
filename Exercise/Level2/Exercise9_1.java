import static java.lang.System.*;
import java.util.*;

class Exercise9_1 {

    public static void main(String[] args) {

	// Scanner();
	Scanner scan = new Scanner(System.in);
	out.println("操作を入力して下さい。");
	out.print("Car info(1), Add truck(2), "
		  + "Delete truck(3), Get passenger(4), Off passenger(5)"
		  + "終了(others)");
	
	// make a book object		
	Vehicle vehicle[] = new Vehicle[2];
	vehicle[0] = new Truck("Blue", 2.0);
	vehicle[1] = new Bus("Green", 30);

	double load;
	int passenger;

	int n = scan.nextInt();	
	while ( 1 <= n && n <= 5 ) {
	    switch (n) {
	    case 1:
		for ( int i = 0; i <= 1; i++ ) {
		    vehicle[i].display();
		}
		break;
		
	    case 2:
		out.print("荷物の重さ[t]を入力してく下さい。");		
		load = scan.nextDouble();
		// cast into Truck type
		((Truck)vehicle[0]).add(load);
		break;
		
	    case 3:
		out.print("荷物の重さ[t]を入力してく下さい。");
		load = scan.nextDouble();
		// cast into Truck type
		((Truck)vehicle[0]).reduce(load);
		break;
		
	    case 4:
		out.print("人数[人]を入力してく下さい。");
		passenger = scan.nextInt();
		// cast into Bus type		
		((Bus)vehicle[1]).carry(passenger);
		break;
		
	    case 5:
		out.print("人数[人]を入力してく下さい。");
		passenger = scan.nextInt();
		// cast into Bus type				
		((Bus)vehicle[1]).drop(passenger);
		break;
		
	    }

	    out.println();
	    out.println("操作を入力して下さい。");
	    out.print("Car info(1), Add truck(2), "
		      + "Delete truck(3), Get passenger(4), Off passenger(5)"
		      + "終了");
	    n = scan.nextInt();
	} // while
    }

}
