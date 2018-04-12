import static java.lang.System.*;

/*
文字列の長さを取り出すmethod
charAt()
length()
*/

class Sample10_1 {
    public static void main(String[] args) {
	String str = "Hello";

	char ch1 = str.charAt(0);
	char ch2 = str.charAt(1);

	int len = str.length();

	out.println("First character is " + ch1);
	out.println("Second character is " + ch2);
	out.println("String length is " + len);
    }
}
