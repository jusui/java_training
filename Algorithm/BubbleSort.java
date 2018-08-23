import static java.lang.System.*;
import java.io.*;

public class BubbleSort {
    public static void main(String[] args) throws IOException {

	out.println("入力する配列の要素数 num を入力して下さい。");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int num = Integer.parseInt(str);
	int[] data = new int[num];
	// int[] data = { 4, 6, 7, 9, 2 };
	
	for ( int i = 0; i < num; i++ ) {
	    out.println( (i+1) + "番目に入力する配列の要素を入力して下さい。");
	    str = br.readLine();
	    int tmp = Integer.parseInt(str);
	    data[i] = tmp;
	}

	sort(data);
	out.println("\n Now sorting... \n");
	for ( int element : data ) {
	    out.println(element + " ");
	}
    }

    public static void sort(int[] data) {
	for ( int i = data.length - 1; i > 0; i-- ) { // dec
	    for ( int j = 0; j < i; j++ ) {
		if ( data[j] > data[j + 1] ) {
		    // 隣接要素の交換
		    int tmp = data[j + 1];
		    data[j + 1] = data[j];
		    data[j] = tmp;
		}
	    }
	}
    }
    
}
