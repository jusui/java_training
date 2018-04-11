import static java.lang.System.*;
import java.io.*;

/*
Tsukuba java coarse
*/

class Rectangle {
    int width;
    int height;

    // constructor : 自動で実行
    Rectangle (int w, int h) {
	this.width = w;
	this.height = h;
    }

    void printInfo() {
	out.println("Width : " + this.width);
	out.println("Heigtht : " + this.height);
    }

    int getArea() { return this.width * this.height; }

    boolean isLargerThan(Rectangle rec) {
	// 自身のmethod : this.getArea(), 引数で渡されたrec.getArea()
	return this.getArea() > rec.getArea();
    }

    // technique (カタカナのキになる)
    void rotate() {
	int tmp = width; // 一時的に幅を記憶
	this.width = this.height;
	this.height = tmp;
    }
}

// extends Object は省略可
class Example extends Object {
    public static void main(String[] args) {
	Rectangle rec = new Rectangle(5, 3);
	rec.printInfo();
    }
}
