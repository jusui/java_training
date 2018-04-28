import static java.lang.System.*;

class kitako1_7 {
    public static void main(String[] args) {
	int x, y;
	x = 3;
	y = 7;
	x = y;
	y = x;
	out.println("x = " + x + ", y = " + y);
    }
}
