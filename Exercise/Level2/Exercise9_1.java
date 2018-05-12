import static java.lang.System.*;
import java.util.*;

class Exercise9_1 {

    public static void main(String[] args) {

	// Scanner();
	Scanner scan = new Scanner(System.in);
	out.println("操作を入力して下さい。");
	out.print("Car info(1), Add truck(2), "
		  + "Delete truck(3), Get passenger(4), Off passenger(5)"
		  + "終了");

	Vehicle vehicle[] = new Vehicle[2];
	vehicle[0] = new Truck("Blue", 2.0);
	vehicle[1] = new Bus("Green", 30);
	
	int bus_weight = scan.nextInt();
	out.println("荷物の重さを入力して下さい。");
	int bus_ = scan.nextInt();

	// make a book object	
	Book book = new Book(b_pages, b_prices);
	out.println("ノートのページ数を入力して下さい。");
	int n_pages = scan.nextInt();
	out.println("ノートの価格を入力して下さい。");
	int n_prices = scan.nextInt();

	// make a notebook object
	Notebook notebook = new Notebook(n_pages, n_prices);
	out.println("操作を入力してく下さい。");
	out.print("Book info(1), Notebook info(2), "
		    + "Add string into Note(3), Finish(4)");

	int n = scan.nextInt();
	while ( 1 <= n && n <= 5 ) {
	    switch (n) {
	    case 1:
		for ( int i = 0; i <= 1; i++ ) {
		    Vehicle[i].display();
		}
		break;
		
	    case 2:
		notebook.display();
		break;
		
	    case 3:
		out.print("文字を入力してく下さい。");
		scan.nextLine();
		notebook.write(scan.nextLine());
		break;
		
	    case 4:
		out.print("人数[人]を入力してく下さい。");
		scan.nextInt();
		Vehicle[0].add();
		break;
		
	    case 5:
		out.print("人数[人]を入力してく下さい。");
		scan.nextInt();
		notebook.write(scan.nextLine());
		break;
		
	    }

	    out.println();
	    out.println("操作を入力してく下さい。");
	    out.print("Car info(1), Add truck(2), "
		      + "Delete truck(3), Get passenger(4), Off passenger(5)"
		      + "終了");
	    n = scan.nextInt();
	} // while
    }

}
