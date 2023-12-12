package demo;

import java.util.Scanner;

public class DigitToWordsAmmount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int ammount = sc.nextInt();
		int temp = ammount;
		String words = "";
		String[] singleDigit = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] doubleDigit = { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "ninteen" };
		String[] tens = { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

		int p = 1;
		while (ammount != 0) {
			ammount = ammount / 10;
			p = p * 10;
		}
		p = p / 10;
		ammount = temp;

		while (ammount != 0) {
			int r = ammount / p;
			// 1 Crore To 10 Crore
			if (p == 10000000 || p == 100000000) {
				if (p == 100000000) {
					r = ammount / (p / 10);
					if (r >= 11 && r <= 19) {
						words = words + doubleDigit[r % 10] + " crore ";
						p = p / 10;
					} else {
						words = words + tens[r / 10];
						words = words + singleDigit[r % 10] + " crore ";
						p = p / 10;
					}
				} else if (p == 10000000) {
					words = words + singleDigit[r] + " crore ";
				}
			}
			// 1 Lakh To 10 Lakh
			else if (p == 100000 || p == 1000000) {
				if (p == 1000000) {
					r = ammount / (p / 10);
					if (r >= 11 && r <= 19) {
						words = words + doubleDigit[r % 10] + " Lakh ";
						p = p / 10;
					} else {
						words = words + tens[r / 10];
						words = words + singleDigit[r % 10] + " Lakh ";
						p = p / 10;
					}
				} else if (p == 100000) {
					words = words + singleDigit[r] + " Lakh ";
				}
			}
			// 1 Thousand To 10 Thousand
			else if (p == 1000 || p == 10000) {
				if (p == 10000) {
					r = ammount / (p / 10);
					if (r >= 11 && r <= 19) {
						words = words + doubleDigit[r % 10] + " Thousand ";
						p = p / 10;
					} else {
						words = words + tens[r / 10];
						words = words + singleDigit[r % 10] + " Thousand ";

						p = p / 10;
					}
				} else if (p == 1000) {
					words = words + singleDigit[r] + " Thousand ";

				}
			}
			// Hundred
			else if (p == 100) {
				if (ammount / 100 != 0)
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
		System.out.println(words);

	}

}
