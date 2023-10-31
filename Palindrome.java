package Excercise.classes;

public class Palindrome {

	public static void main(String[] args) {
		int input=123321;
		int number=input;
		int reverse=0;
		while(number>0) {
			int temp=number%10;
			number=number/10;
			reverse=(reverse*10)+temp;
		}
		if(input==reverse) {
			System.out.println("given number is a palindrome : "+input);
		}else {
			System.out.println("given number is a palindrome : "+input);
		}
		

	}

}
