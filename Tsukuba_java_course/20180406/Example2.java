import static java.lang.System.*;

/*
4. 最も若い学生(youngestStudent)を返す

引数：students
*/

class Student {
    String name;
    int age;
}

class Rectangle {
    double width;
    double height;
}

public class Example2 {
    public static Student getYoungestStudent(Student[] students) {
	Student youngestStudent = students[0]; // 先頭のインスタンス所在地

	// 最も若いものを探す
	for ( int i = 0; i < students.length; i++ ) { // 0は格納済
	    if ( youngestStudent.age > students[i].age ) { // 現状最も若い > 配列順若い
		youngestStudent = students[i];
	    }
	    // 3項演算子で同様の処理
	    // youngestStudent = youngestStudent.age > student[i].age
	    // 	? students[i] : youngestStudent;
	}
	return youngestStudent;
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
    }
}
