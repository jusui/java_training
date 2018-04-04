import static java.lang.System.*;

/*
天気予報のメッセージをランダムに生成して，そのメッセージを返す。
天気予報のメッセージは，次の中からランダムに合わせ作り出す。
{今日・明日・明後日}の天気は{晴れ・曇り・雨・雪}でしょう。
例：明日の天気は雨でしょう。
*/

public class Test {
    public static int getRandomNumber() {
	return (int)(Math.random() * 100) + 1;
    }

    // 4.
    public static String getWeatherForecast() {
	String[] days     = {"今日", "明日", "明後日"};
	String[] weathers = {"晴れ", "曇り", "雨", "雪", "雷"};
	
	int i = (int)(Math.random() * days.length);
	int j = (int)(Math.random() * weathers.length);
	String day = days[i];
	String weather = weathers[i];
	
	// String day     = days[(int)(Math.random() * days.length)];
	// String weather = weathers[(int)(Math.random() * weathers.length)];
	
	String result = day + "の天気は, " + weather + "でしょう。";
	return result;
	
	/* 別解 */
	// return days[(int)(Math.random() * days.length)] + "の天気は"
	//     + weathers[(int)(Math.random() * weathers.length)] + "でしょう。";

	/* switch処理 */
	// switch(i) {
	// case 0:
	//     day = "今日"; break;
	// case 1:
	//     day = "明日"; break;
	// case 2:
	//     day = "明後日"; break;
	// }
    }

    // 6.
    public static boolean isEventNumber(int value) {
	return ( value % 2 == 0 ); // 論理式は値をtrue or falseの値を持つ
    }

    // 7.
    public static double getMinValue(double a, double b) {
	return a < b ? a : b; // 3項演算子
    }

    // 8.
    public static boolean isSameAbsoluteValue(int i, int j) {
	return i == j ? true : false;	
    }
    
    // 9.
    public static String getMessage(String name, boolean iskid) {
	if ( iskid == true ) return "こんにちは。" + name + "ちゃん。";
	else
	    return "こんにちは。" + name + "さん";
    }
    
    // 10.
    public static double getSum(double a, double b, double c) {
	return a + b + c;
    }

    // 11.
    public static double getAverage(double a, double b, double c) {
	return getSum(a, b, c) / 3;
    }
    
    public static void main(String[] args) {
	out.println( getRandomNumber() );      // random number
	out.println( getWeatherForecast() );   // 4
	out.println( isEventNumber(3) );       // 6
	out.println( getMinValue(4, 5) );      // 7
	out.println( isSameAbsoluteValue(4, 5) ); // 8
	out.println( getMessage("jusui", true) );     // 9
	out.println( getSum(10, 20, 30) );     // 10
	out.println( getAverage(10, 20, 30) ); // 11
    }
}
