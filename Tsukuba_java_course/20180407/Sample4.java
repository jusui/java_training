import static java.lang.System.*;

/*
[Constructor]
*必ずクラス名と同じである必要がある
*戻り値を指定できない

*クラスのオブジェクトが生成されたときに，
定義しておいたコンストラクタ内の処理が自動的に行われる

*オブジェクトのメンバに自動的に初期値を設定する
*/
    
class Car {
    private int num;
    private double gas;

    public Car() {
	num = 0;
	gas = 0.0;
	out.println("オブジェクト車を作成しました。");
    }
    public void show() {
	out.println("車のナンバーは " + num + " です。");
	out.println("ガソリン量は " + gas + " です。");
    }
}

public class Sample4 {
    public static void main(String[] args) {
	Car car1 = new Car();
	car1.show();
    }
}
