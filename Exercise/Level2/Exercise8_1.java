import static java.lang.System.*;
import java.util.*;

class Exercise8_1 {

    public static void main(String[] args) {

	// Scanner();
	Scanner scan = new Scanner(System.in);
	out.println("本ページ数を入力して下さい。");
	int b_pages = scan.nextInt();
	out.println("本の価格を入力して下さい。");
	int b_prices = scan.nextInt();

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
	while ( 1 <= n && n <= 3 ) {
	    switch (n) {
	    case 1:
		book.display();
		break;
		
	    case 2:
		notebook.display();
		break;
		
	    case 3:
		out.print("文字を入力してく下さい。");
		scan.nextLine();
		notebook.write(scan.nextLine());
		break;		
	    }

	    out.println();
	    out.println("操作を入力してく下さい。");
	    out.print("Book info(1), Notebook info(2), "
			+ "Add string into Note(3), Finish(4)");
	    n = scan.nextInt();
	} // while
    }

}
