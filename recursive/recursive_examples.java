/** Recursive algorithm */
public static int length (String str){
	if (str == null || str.equals(""))
		return 0;
	else 
		return 1 + length(str.substring(1));
}

public static void printChars(String str) {
	if (str == null || str.equals("")) {
		return;
	} else {
		System.out.println(str.charAt(0));
		printChars(str.substring(1));
	}
}

public static void printCharsReverse(String str) {
	if (str == null || str.equals("")) {
		return;
	} else {
		printCharsReverse(str.substring(1));
		System.out.print(str.charAt(0));
	}
}
