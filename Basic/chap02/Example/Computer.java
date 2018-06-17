import static java.lang.System.*;

class Computer {

    // def field
    String model;
    int serialNumber;
    boolean power = false; // false

    // Constructor
    Computer(String str, int i, boolean b) {
	model = str;
	serialNumber = i;
	power = b;
    }
    
    // def method
    void powerButton() {
	if ( power ) {
	    out.println(model + " is booting!");	 
	} else {
	    out.println(model + " is shutdown!");
	}

	power = !power; // 電源のON/OFF切り替え
    }

    void powerButton(boolean b) {
	if (b) {
	    out.println(model + " is booting!");
	} else {
	    out.println(model + " is shutdown!");
	}
	power = b; // 引数
    }
    
}
