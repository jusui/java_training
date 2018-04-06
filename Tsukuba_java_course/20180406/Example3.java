import static java.lang.System.*;

/*
method：getSquare
引数：double d
戻り値：Rectangle

高さと横幅が共にdであるRectangleの
*/

class Student {
    String name;
    int age;
}

class Rectangle {
    double width;
    double height;
}

public class Example3 {

    public static Student getYoungestStudent(Student[] students) {
	Student youngestStudent = students[0];

	for ( int i = 0; i < students.length; i++ ) {
	    if ( youngestStudent.age > students[i].age ) {
		youngestStudent = students[i];
	    }
	}
	return youngestStudent;
    }
    
    public static Rectangle getSquare(double d, double h) {
	Rectangle rec = new Rectangle();
	// rec.width = rec.height = d; // 同じ場合
	rec.width = d;
	rec.height = h;
	return rec;
    }

    public static void main(String[] args) {
	Student[] ss = new Student[3]; // 3つの要素を持つ配列のインスタンスを生成
	ss[0] = new Student();
	ss[1] = new Student();
	ss[2] = new Student();
	ss[0].name = "Taro";
	ss[0].age = 19;
	ss[1].name = "Hanako";
	ss[1].age = 20;
	ss[2].name = "Jiro";
	ss[2].age = 18;	
	Student s = getYoungestStudent(ss);
	out.println(s.name);
	out.println(s.age);

	// Rectangle
	Rectangle r = getSquare(3.0, 4.0);
	out.println(r.width);
	out.println(r.height);
    }
}
