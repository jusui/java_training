/**
 * 一発変換:文字列に対して行うことができる3種類の編集文字の挿入，削除，置き換えがある
 * 2つの文字列が与えられたとき，一方の文字列に対して1操作(もしくは操作なし)でもう
 * 一方の文字列にできるかどうかを判定する
 * pale, ple -> true
 * palse, ple -> true
 * pale, bale -> true
 * pale, bake -> false
 */

public class OneAway {
    /**
     * method1: replace, insert, delete. It is clearer and easier to follow 
     * but has some duplicate code.
     */
    boolean oneEditAway(String first, String second) {
	if (first.length() == second.length()) {
	    return oneEditReplace(first, second);
	} else if (first.length() + 1 == second.length()) {
	    return oneEditInsert(first, second);	    
	} else if (first.length() - 1 == second.length()) {
	    return oneEditInsert(first, second);
	}
	return false;
    }

    private boolean oneEditReplace(String s1, String s2) {
	boolean foundDifference = false;
	for ( int i = 0; i < s1.length(); i++ ) {
	    if (s1.charAt(i) != s2.charAt(i)) {
		if (foundDifference) {
		    return false;
		}

		foundDifference = true;
	    }
	}
	return true;
    }

}
