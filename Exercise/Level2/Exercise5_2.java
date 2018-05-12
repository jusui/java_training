import static java.lang.System.*;

class Exercise5_2 {

    public static void main(String[] args) {
	
	int list[] = new int[10];
	for ( int i = 0; i < list.length; i++ ) {
	    list[i] = i * 10;
	    out.println("a[" + i + "] = " + list[i]);
	}
    }

}
