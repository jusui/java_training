import static java.lang.System.*;

public class Practice {

    public static double getTriangleArea(double base, double height) {
	return base * height / 2.0;
    }

    public static void main(String[] args) {
	double triangleArea = getTriangleArea(12.0, 3.0);
	out.println("三角形の面積 = " + triangleArea);
    }
}
