import static java.lang.System.*;

/**
Overload
クラス内に複数の同名メソッドが存在可能
*/

class Exercise2_4 {

    public static void main(String[] args) {
	
	Computer comp = new Computer("F-04E", 7293847, true);
	comp.powerButton();
	comp.powerButton(false);	
	
    }
}
