import static java.lang.System.*;

/*
多態性(Polymophism)
Overload:同じ名前の複数のメソッドを，同じクラス内に定義しておく

*/

// Car class
class Car {
    private int num;
    private double gas;

    public void setCar(int n) {
	num = n;
	out.println("Number was changed to " + num);
    }

    public void setCar(double g) {
	gas = g;
	out.println("Gas volume was changed to " + gas);
    }

    public void setCar(int n, double g) {
	num = n;
	gas = g;
	out.println("Number -> " + num + "\n" + "Gas -> " + gas);
    }

    public void show() {
	out.println("Car number: " + num);
	out.println("Gas volume: " + gas + " L");
	out.println();
    }
}

public class Sample3 {
    public static void main(String[] args) {
	Car car1 = new Car();

	car1.setCar(1234, 30.5);
	car1.show();

	out.println("車のナンバーだけ変更します.");
	car1.setCar(2345);
	car1.show();

	out.println("ガソリン量だけ変更します.");	
	car1.setCar(30.5);
	car1.show();	
    }
}
