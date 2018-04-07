import static java.lang.System.*;

/*
カプセル化による，フィールドのアクセス制限
フィールドの制限:private memberを作りアクセスを
method -> public member
*/

// Car class
class Car {
    private int num;
    private double gas;

    public void setNumGas(int n, double g) {
	if ( g > 0 && n > 0 ) {
	    num = n;
	    gas = g;
	    out.println("change field ");
	    out.println("Number -> " + num + "\n" + "Gas -> " + gas);
	} else {
	    out.println(g + " is not correct volume");
	    out.println("Field gas was not changed.");
	}
    }
    public void show() {
	out.println("Car number: " + num);
	out.println("Gas volume: " + gas + " L");
	out.println();
    }
}

public class Sample2 {
    public static void main(String[] args) {
	Car car1 = new Car();
	car1.setNumGas(1234, 20.5);
	car1.show();

	// マイナス値で試す
	out.println("Try to execute gas volume(-10.0).");

	car1.setNumGas(1234, -10.0);
	car1.show();
    }
}
