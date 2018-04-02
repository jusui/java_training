// class を作ってみよう

import static java.lang.System.*;

class Dog {
    // インスタンス変数
    String name;
}

public class Example {
    public static void main(String[] args) {

	// Point classのインスタンスを作成し，変数pに参照を代入する
	Dog dog1  = new Dog(); // インスタンス作成
	dog1.name = "Taro"; // name属性
	Dog dog2  = new Dog();
	dog2.name = "Pochi";
	Dog dog3  = dog2;
	out.println(dog3.name);
	dog3.name = "Jiro";
	out.println(dog2.name);
    }
}
