import static java.lang.System.*;

class Bus extends Vehicle {

    final int MAXPASSENGER;
    int tempPassenger;

    Bus(String color, int maxPassenger) {
	super.color = color;
	super.maxPassenger = maxPassenger;
    }

    void carry(int passenger) {
	if ( passenger > MAXPASSENGER ) {
	    out.println("乗せられません。");
	} else {
	    tempPassenger = passenger;
	}
    }

    void drop(int passenger) {
	if ( tempPassenger < passenger ) {
	    out.println("降ろせません。");	    
	} else {
	    tempPassenger = passenger;
	}
    }
        
}
