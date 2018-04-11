import java.util.Scanner;
import static java.lang.System.*;
    
class BMI {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	out.println("あなたの身長は何cm？");
	double height = s.nextDouble();
	out.println("身長は" + height);
	
	out.println("あなたの体重は何kg？");
	double weight = s.nextDouble();
	out.println("体重は" + weight);

	// 階乗class : Math.pow()
	double BMI = weight / ( Math.pow(height / 100, height / 100) );
	out.println("あなたのBMI: " + BMI);
    }
}
