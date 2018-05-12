class Book {

    int page;
    int price;

    Book(int page, int price) {
	this.page = page;
	this.price = price;
    }

    void display() {
	System.out.println("ページ数 : " + page);
	System.out.println("価格 : " + price);
    }
    
}
