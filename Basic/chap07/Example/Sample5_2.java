import static java.lang.System.*;

/**
例外を送出する：throw 文
 */

class CarException extends Exception {
    // my exception class
}

class Car {
    private int num;
    private double gas;

    public Car() {
	num = 0;
	gas = 0.0;
	out.println("Made a Car object");
    }

    // def : 例外送出メソッド
    public void setCar(int n, double g) throws CarException {
	if ( g < 0 ) {
	    CarException e = new CarException();
	    throw e; // 作成したオブジェクトを送出
	}
	else {
	    num = n;
	    gas = g;
	    out.println("num, gas were changed" + num + ", " + gas);
	}
    }

    public void show() {
	out.println("Car number : " + num);
	out.println("Car gas : " + gas);
    }
}


class Sample5_2 {

    public static void main(String[] args) throws CarException {
	Car car = new Car();
	car.setCar(1234, -10.5);
	car.show();
    }
}
