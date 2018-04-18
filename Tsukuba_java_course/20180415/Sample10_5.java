import java.io.*;
import static java.lang.System.*;

class Sample10_5 {
    public static void main(String[] args) throws IOException {
	out.println("整数を2つ入力して下さい。");

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str1 = br.readLine();
	String str2 = br.readLine();

	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	int ans  = Math.max(num1, num2);
	
	int num3 = (int) (Math.random() * 100) + 1;
	int num4 = (int) (Math.random() * 100) + 1;	
	int ans2 = Math.max(num3, num4);

	if ( num1 != num2 ) { out.println(num1 + "と" + num2 + "のうち大きい方は，" + ans  + "です。"); }
	else { out.println(num1 + " と " + num2 + " は同じ値です。"); }
	    
	out.println(num3 + "と" + num4 + "のうち大きい方は，" + ans2 + "です。");	
    }
}
