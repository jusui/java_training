// class を作ってみよう

import static java.lang.System.*;

class Monster {
    // インスタンス変数
    String name;
    int hp;
    int mp;
    String item;
}

public class Monsters {
    public static void main(String[] args) {

	// Point classのインスタンスを作成し，変数pに参照を代入する
	Monster m0 = new Monster();
	m0.name = "スライム";
	m0.hp   = 100;
	m0.mp   = 10;

	Monster m1 = new Monster();
	m1.name = "ゴーレム";
	m1.hp   = 1000;
	m1.mp   = 100;
	m1.item = "薬草";
	
	Monster m2 = new Monster();
	m2.name = "キングスライム";
	m2.hp   = 10000;
	m2.mp   = 500;
	m2.item = "ひのきの棒";

	// インスタンスを配列にまとめる
	Monster[] monsters = new Monster[5]; // 3つのインスタンスに対して5つの配列を作る
	monsters[0] = m0;
	monsters[1] = m1;
	monsters[2] = m2;

	for ( int i = 0; i < monsters.length; i++ ) {
	    if ( monsters[i] == null ) continue;  // null pointer 対策
	    out.println("モンスターが現れれた. "
			+ monsters[i].name + "HP: " + monsters[i].hp + ", "
			+ "MP: " + monsters[i].mp);
	}
    }
}
