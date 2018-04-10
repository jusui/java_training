import java.util.Scanner;
import static java.lang.System.*;

public class Lecture2 {
    public static void main(String[] args) {
	// instance
	Scanner s = new Scanner(System.in);
	
	out.println("文字列を読み込みます。");

 	out.println("名前は？");
	String name = s.next();
	
 	out.println(name + "さん，こんにちは。");

 	out.println("Weight?");	
	double d = s.nextDouble();
 	out.println(d + "kg.");	
    }
}
