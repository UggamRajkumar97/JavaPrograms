package demo;

public class DigitTOWords2Digit {

	public static void main(String[] args) {

		int ammount = 94;

		String words = "";
		String[] singleDigit = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] doubleDigit = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "ninteen" };
		String[] tens = { "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

		if (ammount > 0 && ammount < 10) {
			words = singleDigit[ammount];
		} else if (ammount >= 10 && ammount < 20) {
			words = doubleDigit[ammount % 10];
		} else if (ammount >= 20 && ammount < 100) {
			words = singleDigit[ammount % 10];
			ammount = ammount / 10;
			words = tens[ammount - 1 % 10] + words;
		}

		System.out.println(words);
	}

}
