import static java.lang.System.*;

/** 
Constructor
オブジェクト生成時に実行される処理
*/

class Exercise2_3 {

    public static void main(String[] args) {
	Computer comp;
	comp = new Computer("F-04E", 76823468, true);

	comp.powerButton();
    }
    
}
