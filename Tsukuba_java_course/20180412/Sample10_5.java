import static java.lang.System.*;
import java.io.*;
import java.util.*;

/*
[int型] / wrapper class

*/

class Sample10_4 {
    public static void main(String[] args) throws IOException {

	out.println("文字列を入力して下さい");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str1 = br.readLine();
	
	out.println("文字を追加して下さい");
	String str2 = br.readLine();

	// SrtingBuffer class
	StringBuffer sb = new StringBuffer(str1);
	sb.append(str2); // 文字列を追加する

	out.println(str1 + "に" + str2 + "を追加すると" + sb + "です。");
	
	out.println("置換したい文字列を記入して下さい");
	String str3 = br.readLine();
	int start = 3;
	int end = 5;
	sb.replace(start, end, str3);
	sb.reverse();
	out.println("str1を反転すると: "+ sb);
    }
}
