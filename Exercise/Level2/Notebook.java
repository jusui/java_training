class Notebook extends Book {

    String contents;
    
    Notebook(int page, int price) {
	super(page, price);
	contents = "";
    }

    void write(String message) {
	contents += message;
    }

    void display() {
	super.display();
	System.out.println("内容 : " + contents);
    }

}
