package Excercise.classes;

public class ReversNumber {

	public static void main(String[] args) {
		int number = 1234;
		int reverse=0;
		while (number >0) {
		    int temp = number % 10;
			number = number / 10;
			reverse=(reverse*10)+temp;//4321
		}
		System.out.println(reverse);
	}

}
