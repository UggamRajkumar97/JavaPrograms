package exam.assignments;

public class LastRepeated {
	public static void main(String[] args) {

		String str = "103390934141";
		// 10339093414
		//
		// last repeated number
		char[] strArr = str.toCharArray();
		char eachChar;
		int isCount = 0;
		char lastRepChar = ' ';
		for (int i = 0; i < strArr.length; i++) {
			eachChar = strArr[i];
			isCount = 0;
			for (int j = 0; j < strArr.length; j++) {
				if (eachChar == strArr[j]) {
					isCount++;
				} // if
			} // for j
			if (isCount > 1) {
				lastRepChar = eachChar;
			} // if
		} // for i

		System.out.println("Last Repeated Char--->" + lastRepChar);
	}
}
