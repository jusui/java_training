import static java.lang.System.*;

/**
インスタンスとstatic
static メンバは，1クラスにひとつ存在し，オブジェクトの生成とは無関係ん存在。
オブジェクトを生成しなくても利用できる。
*/

class Example2_6 {

    public static void main(String[] args) {
	out.println("家族共通の細部の残高：" +
		    Wallet.familyBalance + "円");

	// インスタンス
	Wallet taro = new Wallet();
	Wallet hanako = new Wallet();

	out.println("taro's 残高\t" + taro.balance + "円");
	out.println("hanako's 残高\t" + hanako.balance + "円");	


	// objectごとの変数
	taro.balance -= 1000;
	hanako.balance -= 2000;

	hanako.familyBalance -= 3000;

	out.println();
	out.println("家族共通の財布の残高：" + Wallet.familyBalance + "円");
	out.println("taro's 残高\t" + taro.balance + "円");
	out.println("hanako's 残高\t" + hanako.balance + "円");	
	
    }
}
