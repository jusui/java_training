import java.util.*;

class Truck extends Vehicle {

    final double MAXLOAD;
    double tempLoad;

    Truck(String color, double maxLoad) {
	super(color);
	this.MAXLOAD = maxLoad;
	this.tempLoad = 0;
	
    }

    void add(double load) {
	if ( tempLoad + load <= MAXLOAD ) {
	    tempLoad += load;
	    System.out.println(tempLoad + "を積みました。");
	} else {
	    System.out.println("これ以上積めません。");
	}
    }

    void reduce(double load) {
	if ( tempLoad - load >= 0 ) {
	    tempLoad -= load;
	    System.out.println(tempLoad + "降ろしました。");	    
	} else {
	    System.out.println("これ以上降ろせません。");	    
	}
    }
    
    void display() {
	super.display();
	//	System.out.println("Car type : " + );
	System.out.println("Color : " + color);	
	System.out.println("最大積載量[t] : " + MAXLOAD);
	System.out.println("現在積載量[t] : " + tempLoad);
    }
    
}
