/*
インスタンスメソッド
*/

import static java.lang.System.*;

class Student {
    String name;
    int age;
    
}

class Rectangle {
    double width;
    double height;

    // Rectangle class constructor
    Rectangle(double w, double h) {
	this.width = w;
	this.height = h;
    }
}

public class Lecture {
    public static void main(String[] args) {
	
	// Rectangle class(引数2個)のコンストラクタを呼び出す
	Rectangle r = new Rectangle(3.0, 3.0);
	out.println("r.width: " + r.width + ", r.height: " + r.height);
    }
}
