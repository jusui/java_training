import static java.lang.System.*;

/*
別のコンストラクタを呼び出す
*/

class Car {
    private int num;
    private double gas;

    public Car() {
	num = 0;
	gas = 0.0;
	out.println("車を作成しました。");
    }

    public Car(int n, double g) {
	this(); // 引数2個のコンストラクタの"先頭"で，引数のないコンストラクタを呼び出す
	num = n;
	gas = g;
	out.println("ナンバーを" + num + "，ガソリン量を" + gas + "にしました。");
    }

    public void show() {
	out.println("車のナンバーは，" + num);
	out.println("ガソリン量は，" + gas);	
    }
}

class Sample6 {
    public static void main(String[] args) {
	Car car1 = new Car();
	car1.show();
	
	Car car2 = new Car(1234, 20.5);
	car2.show();
    }
}
