/***
    回分の順列：文字列が回分の順列であるかどうかを調べる関数
    input : Tact Coa
    output: True
 */

public class DS_1_4 {

    static boolean isPermutationOfPalindrome(String phrase) {
	int[] table = buildCharFrequencyTable(phrase);
	return checkMaxOneOdd(table);
    }
    
    /* 文字列が奇数の文字が複数存在しないことを確認 */
    static boolean checkMaxOneOdd(int[] table) {
	boolean foundOdd = false;
 	for ( int count : table ) {
	    if ( count % 2 == 1 ) {
		if ( foundOdd ) {
		    return false;
		}
		foundOdd = true;
	    }
	}
	return true;
    }

    /* 文字を数字に割り当てる. a -> 0, b -> 1, c->2, etc...
       大文字小文字の区別はせず，文字以外は-1 とする */
    static int getCharNumber(Character c) {
	/*** Characterクラスのオブジェクトは'A'、'z'など単一文字の値を保持し
	     一度文字が代入されると変更することはできないという性質を持つ */
	int a = Character.getNumericValue('a');
	int z = Character.getNumericValue('z');	
	int val = Character.getNumericValue(c);
	if ( a <= val && val <= z ) {
	    return val - a;
	}
	return -1;
    }

    /* 各文字が何回現れるかを数える */
    static int[] buildCharFrequencyTable(String phrase) {
	int[] table = new int[Character.getNumericValue('z') -
			      Character.getNumericValue('a') + 1];
	for ( char c : phrase.toCharArray() ) {
	    int x = getCharNumber(c);
	    if ( x != -1 ) {
		table[x]++;
	    }
	}
	return table;
    }
    
    public static void main(String[] args) {
	String pali = "Rats live on no evil star";
	System.out.println(isPermutationOfPalindrome(pali));
    }
}
