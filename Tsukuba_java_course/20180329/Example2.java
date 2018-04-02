public class Example2 {
    public static void main(String[] args) {

	// 10未満の乱数を発生させる
	int i = (int)(Math.random() * 10);
	System.out.println(i);

	if ( i > 5 ) {
	    System.out.println("You win!");
	} else {
	    System.out.println("You lose!");
	}

	// (1).4未満の乱数を発生させる
	int j = (int)(Math.random() * 4);
	System.out.println(j);

	// (2).1,2,3,4,5,6のいずれかがの値をランダム出力
	int k = 1 + (int)(Math.random() * 6);
	System.out.println(k);

	// (3).2,4,6,8のいずれかがの値をランダム出力
	int l = 2 * (1 + (int)(Math.random() * 4));
	System.out.println(l);

	// (4).-5 ~ 5のいずれかがの値をランダム出力
	int m = (int)(Math.random() * 11);
	m -= 5;
	System.out.println(m);

	// 絶対値を求める
	int a = -5;
	int c = (a > 0) ? a : -a;
	System.out.println(c);
    }
}
