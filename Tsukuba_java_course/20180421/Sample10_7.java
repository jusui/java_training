import static java.lang.System.*;
import java.io.*;

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
	out.println("ナンバーを " + num + ", ガソリン量を " + gas + "にしました。");
    }
    public void show() {
	out.println("車のナンバーは，" + num + "です。");
	out.println("車のガソリン量は，" + gas + "です。");	
    }
}

class Sample10_7 {
    public static void main(String[] args) throws IOException {
	Car car1 = new Car();
	out.println("car1を宣言しました。");
	car1.setCar(1234, 20.5);

	Car car2;
	out.println("car2を宣言しました。");
	
	car2 = car1;	
	out.println("car2をcar1に代入しました。");

	out.print("car1");
	car1.show();
	
	out.print("car2");
	car2.show();

	out.println("car1が指す車を変更する");
	car1.setCar(2345, 30.5);

	out.print("car1が示す");
	car1.show();
	out.print("car2が指す");
	car2.show();
    }
}
