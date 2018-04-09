import static java.lang.System.*;

/*
クラス変数とクラスメソッド
*/

class Car {
    private int num;
    private double gas;

    public Car() {
	num = 0;
	gas = 0.0;
	out.println("車を作成しました。");
    }

    public void setCar(int n, double g) {
	num = n;
	gas = g;
	out.println("ナンバーを" + num + "，ガソリン量を" + gas + "にしました。");
    }

    public void show() {
	out.println("車のナンバーは，" + num);
	out.println("車のガソリン量は，" + gas);
    }
}

class Sample7 {
    public static void main(String[] args) {
	Car car1 = new Car();
	car1.setCar(1234, 20.5);
	car1.show();

	Car car2 = new Car();
	car2.setCar(5678, 30.5);
	car2.show();
    }
}
