import static java.lang.System.*;

// Bookに関するクラスを構築せよ.

class Book {
    String title;
    String author;
    int price;
}

public class Exer3 {
    public static void main(String[] args) {
	Book books[] = new Book[3];
	books[0] = new Book();
	books[0].title  = "Java入門";
	books[0].author = "筑波太郎";
	books[0].price  = 1200;
	books[1] = new Book();
	books[1].title  = "上級Java";
	books[1].author = "筑波次郎";
	books[1].price  = 2200;
	books[2] = new Book();
	books[2].title  = "実践Java";
	books[2].author = "筑波三郎";
	books[2].price  = 1800;

	for ( int i = 0; i < books.length; i++ ) {
	    books[i].price *= 1.08;
	}

	for ( int i = 0; i < books.length; i++ ) {
	    out.println("title: " + books[i].title);
	    out.println("author: " + books[i].author);
	    out.println("price: " + books[i].price);
	}
    }
}
