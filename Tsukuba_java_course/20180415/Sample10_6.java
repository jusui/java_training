import java.io.*;
import static java.lang.System.*;

/*
10.4 クラス型の変数
*/

class Car {
    private int num;
    private double gas;

    public Car() {
	num = 0;
	gas = 0.0;
	out.println("Carクラスを作りました。");
    }

    public void setCar(int n, double g) {
	num = n;
	gas = g;
	out.println("ナンバーを" + num + ", ガソリン量を" + gas + "にしました。");
    }

    public void show() {
	out.println("車のナンバーは" + num + "です。");
	out.println("ガソリン量は" + gas + "です。");
    }
}

class Sample10_6 {
    public static void main(String[] args) {
	Car car1 = new Car();
	car1.setCar(1234, 20.5);

	Car car2;
	car2 = car1;
	out.println("car2にcar1を代入しました。");
	out.println();
	
	out.println("car1がさす");
	car1.show();
	out.println("car2がさす");
	car2.show();	
    }
}
