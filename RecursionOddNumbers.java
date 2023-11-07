package classes.practice;

public class RecursionOddNumbers {

	public static void main(String[] args) {
		int n = 10;
		// 1+3+5+7+9===25
		System.out.println(sumRec(n));
	}

	private static int sumRec(int n) {
		if (n == 1)
			return 1;
		else {
			if (n % 2 == 0)
				return sumRec(n - 1);
			else
				return n + sumRec(n - 1);
		}
	}
}
