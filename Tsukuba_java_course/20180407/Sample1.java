import static java.lang.System.*;

// Car class
class Car {
    int num;
    double gas;

    void show() {
	out.println("Car number: " + num);
	out.println("Gas volume: " + gas + " L");
    }
}

public class Sample1 {
    public static void main(String[] args) {
	Car car1 = new Car();

	car1.num = 1234;
	car1.gas = 20.5

	car1.show();
    }
}