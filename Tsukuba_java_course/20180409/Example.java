import static java.lang.System.*;
/*
課題.
*/

class Rectangle {
    int width;
    int height;

    Rectangle(int w, int h) {
	this.width = w;
	this.height = h;
    }

    void printInfo() {
	out.println("Width: " + this.width + ", height: " + this.height);
    }

    int getArea() { return this.width * this.height; }

    boolean isLargerThan(Rectangle r) {
	// 自身のgetArea() method	
	return this.getArea() > r.getArea();
    }
    
    void rotate() {
	// 変数の値を入れ替える
	int tmp = width; // 幅を記憶しておく
	this.width = this.height;
	this.height = tmp; // 記憶した値を用いる
    }
}

public class Example {
    public static void main(String[] args) {

	Rectangle r = new Rectangle(5, 3);
	r.printInfo();
    }
}
