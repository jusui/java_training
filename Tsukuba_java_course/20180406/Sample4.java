/*
[chap.9]
Constructor : プログラムの部品の初期設定が自動的の行われるようにするためのしくみ
*/
import static java.lang.System.*;

class Car {
    private int num;
    private double gas;

    public Car() {
	num = 0;
	gas = 0.0;
	out.println("車を作成しました。");
    }
    public void show() {
	out.println("車のナンバーは，" + num + "です。");
	out.println("ガソリン量は，" + gas + "です。");
    }
}

public class Sample4 {
    public static void main(String[] args) {
	// オブジェクトを作成するとコンストラクタが呼び出される
	Car car1 = new Car();
	car1.show(); 
    }
}
