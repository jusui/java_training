import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Janken {

    // def win/lose
    private static int win  = 0;
    private static int lose = 0;

    // def draw
    private static boolean retry = true;

    private static void retry() {
	
	// 入力ストリームの生成
	try {
	    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    // String player;
	    // out.println("もう一回続けるなら「Enter」を押して下さい。");	    
	    // String line = br.readLine();
	    
	    Scanner sc = new Scanner(System.in);
	    out.println("もう一回続けるなら「0」を押して下さい。");
	    int re = sc.nextInt();

	    if ( re == 0 ) {
		out.println("もう一回勝負！");
	    } else {
		retry = false;
	    }
	} catch(Exception e) { 
	    retry = false;
	}
    }

    // 勝敗見やすくするメソッド
    private static void winlose() {
	out.println("勝敗数");
	out.println("Win : " + win + "回");
	out.println("Lose : " + lose + "回");
	out.println("*****************************");
    }
    
    public static void main(String[] args) {
	
	// 「グー」，「チョキ」，「パー」
	final int GU = 0; // final : オーバーライドさせない
	final int CHO = 1;
	final int PA = 2;

	// Playerの入力文字
	String gu  = "stone";
	String cho = "scissors";
	String pa  = "paper";

	out.println("じゃんけん勝負です！");

	while ( retry ) {
	    try {
		// 入力ストリーム
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String player;
		while ( true ) {
		    out.println("「stone」「scissors」「paper」のどれかを打って下さい");

		    player = br.readLine();
		    if ( gu.equals(player) || cho.equals(player) || pa.equals(player)) {
			out.println("あなたが出した手は「" + player + "」です。");

			break;
		    } else {
			out.println("「stone」「scissors」「paper」のどれかを打って下さい");
		    }
		}
		
		int cpu = (int)(Math.random() * 3);
		if ( cpu == GU ) {
		    out.println("私が出したては「stone」です。");
		} else if ( cpu == CHO ){
		    out.println("私が出したては「scissors」です。");
		} else if ( cpu == PA ){
		    out.println("私が出したては「paper」です。");
		}

		switch(cpu) {
		case 0: // gu = 0;
		    if ( gu.equals(player) ) {
			out.println("あいこで？");
		    } else if ( cho.equals(player) ) {
			out.println("あなたの負けです。");
			out.println("****************************");			
			lose += 1;
			winlose();
			retry();
		    } else if ( pa.equals(player) ) {
			out.println("あなたの勝ちです。");
			out.println("****************************");
			win += 1;
			winlose();
			retry();
		    }
		    break;
		    
		case 1: // cho = 1;
		    if ( gu.equals(player) ) {
			out.println("あなたの勝ちです。");
			out.println("****************************");
			win += 1;
			winlose();
			retry();
		    } else if ( cho.equals(player) ) {
			out.println("あいこで？");
		    } else if ( pa.equals(player) ) {
			out.println("あなたの負けです。");
			out.println("****************************");			
			lose += 1;
			winlose();
			retry();
		    }
		    break;
		    
		case 2: // pa = 2;
		    if ( gu.equals(player) ) {
			out.println("あなたの負けです。");
			out.println("****************************");
			lose += 1;
			winlose();
			retry();
		    } else if ( cho.equals(player) ) {
			out.println("あなたの勝ちです。");
			out.println("****************************");
			win += 1;
			winlose();
			retry();
		    } else if ( pa.equals(player) ) {
			out.println("あいこで？");
		    }
		    break;
		    
		} // switch
		
	    } catch(IOException e) {
		out.println("Exception :" + e);
	    }
	} // while
	
    } // main
} // Janken class
