/*
 * 配列によるスタックの実装
 */
import java.util.*;

public class MyStack {
    private Object stack[];   // スタック本体
    private int    stackSize; // スタックの大きさ
    private int    sp;        // スタックポインタ

    // デフォルトのスタックの大きさ
    private static final int DEFAULT_STACK_SIZE = 100;

    /**
     * スタックを生成する
     */
    public MyStack() {
	this(DEFAULT_STACK_SIZE);
    }

    /**
     * 大きさを指定してスタックを生成する
     *
     * @param size スタックの大きさ
     */
    public MyStack(int size) {
	stack = new Object[size];
	stackSize = size;
	sp = 0;
    }

    /**
     * スタックの中身を捨ててからの状態にする
     */
    public void clean() {
	Arrays.fill(stack, 0, sp, null); // スタックをnull でクリアする
	sp = 0; // スタックポインタを 0 にする
    }

    /**
     * スタックにデータを積む
     * @param x 積むデータ
     */
    public void push(Object x) {
	if ( sp >= stackSize ) {
	    throw new IllegalStateException("Stack overflow");
	}
	stack[sp++] = x;
    }

    /**
     * スタックからデータを降ろす
     * @return スタックか降ろしたデータ
     */
    public Object pop() {
	if ( sp <= 0 ) {
	    throw new EmptyStackException();
	}
	Object value = stack[--sp];
	stack[sp] = null; // 空いた要素を null でクリアする	
	return value;
    }
    
    /**
     * スタックが空かどうか調べる
     */
    public boolean isEmpty() {
	return sp == 0;
    }
    
    /**
     * スタックの内容を表す文字列を返す
     * @param スタックの内容を表す文字列を返す
     */
    public String toString() {
	String s = "MyStack=[";
	for ( int i = 0; i < sp; i++ ) {
	    s = s + stack[i];
	    if ( i < sp - 1 ) {
		s = s + ",";
	    }
	}
	s = s + "]";
	return s;
    }

    /**
     * テスト用メインルーチン
     */
    public static void main(String[] args) {
	MyStack stack = new MyStack();

	stack.push("a");
	stack.push("b");
	stack.push("c");

	System.out.println(stack);
	System.out.println("pop:" + stack.pop());
	System.out.println(stack);
	stack.push("d");
	stack.push("e");
	stack.push("f");
	System.out.println(stack);

	while(!stack.isEmpty()) {
	    System.out.println("pop:" + stack.pop());
	}
	System.out.println("DONE! " + stack);
    }
    
}
