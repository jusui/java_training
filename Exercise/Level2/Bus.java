import static java.lang.System.*;

class Bus extends Vehicle {

    final int MAXPASSENGER;
    int tempPassenger;

    Bus(String color, int maxPassenger) {
	super(color);
	this.MAXPASSENGER = maxPassenger;
	this.tempPassenger = 0;
    }

    void carry(int passenger) {
	if ( tempPassenger + passenger <= MAXPASSENGER ) {
	    tempPassenger += passenger;
	    out.println(passenger + "人乗せました。");
	} else {
	    out.println("乗せられません。");	    
	}
    }

    void drop(int passenger) {
	if ( tempPassenger - passenger >= 0 ) {
	    out.println(passenger + "人降ろしました。");
	} else {
	    tempPassenger -= passenger;
	    out.println("降ろせません。");	    	    
	}
    }

    void display() {
	System.out.println("Car type : Bus");	
	super.display();
	System.out.println("最大積載量[t] : " + MAXPASSENGER + "[人]");
	System.out.println("現在積載量[t] : " + tempPassenger + "[人]");
    }
        
}
