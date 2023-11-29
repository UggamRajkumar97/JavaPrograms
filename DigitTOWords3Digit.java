package demo;

public class DigitTOWords3Digit {

	public static void main(String[] args) {

		int ammount = 600;
		int temp = ammount;
		String words = "";
		String[] singleDigit = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] doubleDigit = { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "ninteen" };
		String[] tens = { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

		if (ammount > 0 && ammount < 10) {
			words = singleDigit[ammount];
		} else if (ammount >= 10 && ammount < 20) {
			words = doubleDigit[ammount % 10];
		} else if (ammount >= 20 && ammount < 100) {
			words = singleDigit[ammount % 10];
			ammount = ammount / 10;
			words = tens[ammount % 10] + words;
		} else if (ammount >= 100 && ammount < 1000) {
			int p = 100;
			while (ammount != 0) {
				int r = ammount / p;
				if (p == 100) {
					words += singleDigit[r] + " hundred ";
				} else if ((p == 10) && (ammount >= 11 && ammount <= 19)) {
					words += doubleDigit[ammount % 10];
					break;
				} else if (p == 10) {
					words += tens[ammount / 10];
				} else if (p == 1) {
					words += singleDigit[ammount];
				}
				ammount %= p;
				p = p / 10;
			}

		}

		System.out.println(words);
	}

}
