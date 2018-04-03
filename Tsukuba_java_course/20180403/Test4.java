import static java.lang.System.*;

/*
引数：なし
戻り値の型：String
天気予報メッセージをランダムに生成して，
そのメッセージを返す。天気予報メッセージは，次の中からランダムに組み合わせて作り出している。
{今日・明日・明後日}の天気は，{晴れ・雨・雪}
*/

public class Test4 {

    public static int getWeatherForecast() {
	int i = (int)(Math.random() * 100) + 1;
	return i;
    }
    
    public static void main(String[] args) {
	out.println( getRandomNumber() );
    }
}
