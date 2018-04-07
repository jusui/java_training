/*
【インスタンスメソッド】:Dog classについて十分に理解していなくても構わない.
クラスが複数ある場合，インスタンスメソッドを使ったほうが，管理しやすくチームでの開発が容易になる.

【クラスメソッド】: Dog classについて十分に理解している必要がある.
*/

import static java.lang.System.*;
// static : クラス変数(class内のすべての変数が保有する情報)

class Dog {
    String name;
    int age;

    // インスタンスメソッド
    void printInfo() {
	out.println("Name is " + this.name);
	out.println("Age is " + this.age);
    }
}

public class Lecture2 {
    public static void main(String[] args) {

	// クラスメソッドで書く場合 //
	// public static void printInfo(Dog d) {
	//     out.println("名前:" + d.name);
	//     out.println("年齢:" + d.age);
	// }
	
	Dog dog = new Dog(); // make an instance
	dog.name = "Taro";
	dog.age = 2;
	dog.printInfo();
    }
}
