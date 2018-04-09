import static java.lang.System.*;

/*
修飾子 : static
フィールドとメソッドは，宣言・定義する時に static をつける
*/

// car class
class Car {
    // class変数
    public static int sum = 0;

    private int num;
    private double gas;

    public Car() {
	num = 0;
	gas = 0.0;
	sum++;
	out.println("車を作成しました。");
    }

    public void setCar(int n, double g) {
	num = n;
	gas = g;
	out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
    }

    public static void showSum() {
	out.println("車は全部で" + sum + "台あります。");
    }
    
    public void show() {
	out.println("車のナンバーは" + num);
	out.println("車のガソリン量は" + gas);
    }
}

class Sample8 {
    public static void main(String[] args) {
	Car.showSum();

	Car car1 = new Car();
	car1.setCar(1234, 20.5);
	
	Car.showSum();
	Car car2 = new Car();
	car2.setCar(4567, 30.5);

	Car.showSum();
    }
}
