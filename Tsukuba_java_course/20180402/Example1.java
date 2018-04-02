import static java.lang.System.*;

public class Example1 {
    public static void countDonw() {
	for ( int i = 10; i >= 0; i-- ) {
	    out.println(i);
	}
    }

    // void:何も返さない
    public static void methodName() {
	out.println("Methodとして定義された何かの処理を実行する");
	methodB();
    }
    
    // void:何も返さない    
    public static void methodB() {
	out.println("Method Bの中身");
    }
    
    public static void main(String[] args) {
	countDonw();
	out.println("前処理");
	methodName();
	out.println("後処理");	
    }
}
