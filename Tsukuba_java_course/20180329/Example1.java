public class Example1 {

    public static void main(String[] args) {
	int i;
	i = 5;
	double j;
	j = 5.234;
	boolean k;
	k = true;
	System.out.println("Good evening!");
	System.out.println(1 + 2 + 3);
	System.out.println(2 - 7 % 3 + 9 * 1);
	System.out.println("これから\"Java\"の歴史を勉強します."); // エスケープシーケンス
	System.out.println("i = " + i);
	System.out.println("j = " + j);
	System.out.println("k = " + k);

	// 変数の型変換 cast演算子
	double d = 9.8;
	int ii = (int)d; // cast double -> int
	System.out.println(ii);

	int a = 7;
	int b = 2;
	double c = (double)a / (double)b;
	System.out.println("c = " + c);

	// String型
	String s;
	s = "YEAH!";
	System.out.println(s);
	String s1 = "こんにちは";
	String s2 = "今日はいい天気ですね";
	System.out.println(s1 + ", " + s2);
    }
}
