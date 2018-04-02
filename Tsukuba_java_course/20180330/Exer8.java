/*
次のコードを完成させよ
*/
import static java.lang.System.*;

public class Exer8 {
    public static void main(String[] args) {
	
	int [] array = {3, 1, 4, 2, 3, 2, 4, 5, 9};
	for ( int i = 0; i < array.length; i++ ) { // 1 ~ array.length段の繰り返し
	    for ( int j = 0; j < array[i]; j++ ) { // 段数と同じだけ◯を出力
		out.print("◯");
	    }
	    out.println();
	}
    }
}
