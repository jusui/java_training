import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Assistant {
    void sleep() {
	try {
	    out.println("sleep 3 sec");
	    Thread.sleep(3000); // Exception method : 3000 msec
	    out.println("Awake!");
	} catch(InterruptedException e)  {
	    e.printStackTrace();
	}
	
    }
}
