import static java.lang.System.*;

class Circle {
    double Circle1(double x1, double y1, double r1) {
	double dr = Math.sqrt( (x1*x1) + (y1*y1) );
	return dr;
    }
}

public class Test {
    public static void main(String[] args) {
	// circle 1
	int cx1 = 100, cy1 = 100, r1 = 50;

	// circle 2
	int cx2 = 150, cy2 = 150, r2 = 50;

	// 実際のX, Y
	int vx = Math.abs(cx2 - cx1);
	int vy = Math.abs(cy2 - cy1);

	// 半径
	int v = r1 + r2;

	out.println(vx*vx + vy*vy <= v*v);
    }
}
