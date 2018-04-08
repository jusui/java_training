import static java.lang.System.*;

/*
コンストラクタのオーバーロード
*/

class Car {
    private int num;
    private double gas;

    public Car() { // constructor
	num = 0;
	gas = 0.0;
	out.println("車を作成しました。");
    }

    public Car(int n, double g) {
	num = n;
	gas = g;
	out.println("ナンバー: " + num + "\n" + "ガソリン量: " + gas + "の車を作成しました。");
    }

    public void show() {
	out.println("車のナンバーは，" + num);
	out.println("ガソリン量は，" + gas);
    }
}

class Sample5 {
    public static void main(String[] args) {
	Car car1 = new Car();
	car1.show();

	Car car2 = new Car(1234, 20.5);
	car2.show();
    }
}
