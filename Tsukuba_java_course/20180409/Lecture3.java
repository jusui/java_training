import java.util.Scanner;
import static java.lang.System.*;

class Lecture3 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	out.println("名前は?");
	String name = s.next();
	
	out.println("BMIを測定します。");
	out.println("身長");
	double height = s.nextDouble();
	out.println("身長= " + height);

	out.println("体重");	
	double weight = s.nextDouble();
	out.println("体重= " + weight);

	out.println("BMI");
	double BMI = weight / ( (height / 100) * (height / 100) );
	out.println(name + "さんのBMI =" + BMI);
    }
}
