/***
    文字列内に出現するすべての空白文字を"%20"で置き換えるプログラム
    Input  : "Mr John Smith ", 13
    Output : "Mr%20John%20Smith%20"

 */

import java.util.Scanner;
import java.util.Arrays;
    
class DS_1_3 {

    // 置換
    public static void replaceSpaces(char[] str, int trueLength) {
	int spaceCount = 0, index, i = 0;
	for ( i = 0; i < trueLength; i++ ) {
	    if (str[i] == ' ') {
		spaceCount++;
	    }
	}

	index = trueLength + spaceCount * 2;
	if (trueLength < str.length) str[trueLength] = '\0'; // 配列の終端
	for ( i = trueLength - 1; i >= 0; i-- ) {
	    if (str[i] == ' ') {
		str[index - 1] = '0';
		str[index - 2] = '2';
		str[index - 3] = '%';
		index = index - 3;
	    } else {
		str[index - 1] = str[i];
		index--;
	    }
	}
    }

    public static void main(String[] args) {

	// System.out.print("Input string.length > ");	      
	// Scanner scanNum = new Scanner(System.in);
	// int num = scanNum.nextInt();
	
	// System.out.print("Input String > ");			
	// Scanner scan = new Scanner(System.in);
	// String str = scan.next();
	// char[] content = str.toCharArray();
	// Arrays.sort(content);
	// System.out.print(content);

	String str = "Mr John Smith ";
	char[] content = str.toCharArray();
	Arrays.sort(content);	
	replaceSpaces(content, 13);
    }
    
}

