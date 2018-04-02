// class を作ってみよう

import static java.lang.System.*;

class Monster {
    // インスタンス変数
    String name;
    int hp;
    int mp;
    String item;
}

class Deck {
    Monster[] monsters;
}

public class Monsters2 {
    public static void main(String[] args) {

	// Deckを作る
	Deck d = new Deck();
	d.monsters = new Monster[5];
	d.monsters[0] = new Monster();
	d.monsters[0].name = "スライム";
	d.monsters[0].hp   = 100;
	d.monsters[0].mp   = 0;

	d.monsters[1] = new Monster();
	d.monsters[1].name = "ゴーレム";
	d.monsters[1].hp = 1000;
	d.monsters[1].mp = 500;
	d.monsters[1].item = "薬草";
	
	for ( int i = 0; i < d.monsters.length; i++ ) {
	    if ( d.monsters[i] == null ) continue;  // null pointer 対策
	    out.println("モンスターが現れれた. "
			+ d.monsters[i].name + "HP: " + d.monsters[i].hp + ", "
			+ "MP: " + d.monsters[i].mp);
	}
    }
}
