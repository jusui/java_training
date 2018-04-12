import static java.lang.System.*;
import java.util.*;
import java.io.*;

/*
大文字・小文字変換
*/

class Sample10_2 {
    public static void main(String[] args) throws IOException {
	out.println("Input English!");

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();

	String stru = str.toUpperCase(); // 大文字変換
	String strl = str.toLowerCase(); // 小文字変換

	out.println("toUpperCase->" + stru);
	out.println("toLowerCase->" + strl);
    }
}
