import static java.lang.System.*;
/*
以下のプログラムコードに対して以降の設問に応えなさい
(3). 10個のRectangleオブジェクトを構築せよ。
(4). 10個のRectangleオブジェクトのうち，最大面積と最小面積を求め出力せよ。
*/

class Rectangle{
    double width;
    double height;
}

public class Practice {
    public static void main(String[] args) {
	Rectangle[] rects = new Rectangle[10];
	for ( int i = 0; i < rects.length; i++ ) {
	    rects[i] = new Rectangle(); // 配列のインスタンスを作る
	    rects[i].width = Math.random();
	    rects[i].height = Math.random();
	}
	// Max, Minを探し一時的に覚える入れ物
	Rectangle largestRectangle = null; // 比較は[0]から始める
	Rectangle smallestRectangle = null;

	for ( int i = 0; i < rects.length; i++ ) {
	    if ( largestRectangle == null ) {
		largestRectangle = rects[i];
	    } else if ( largestRectangle.width * largestRectangle.height
			< rects[i].width * rects[i].height )
		largestRectangle = rects[i];

	    if ( smallestRectangle == null ) {
		smallestRectangle = rects[i];
	    } else if ( smallestRectangle.width * smallestRectangle.height
			> rects[i].width * rects[i].height )
		smallestRectangle = rects[i];
	}

	out.println("Maximum rectangle width :" +
		    largestRectangle.width +
		    "height :" +
		    largestRectangle.height);
	
	out.println("Minimum rectangle width :" +
		    smallestRectangle.width +
		    "height :" +
		    smallestRectangle.height);
    }
}
