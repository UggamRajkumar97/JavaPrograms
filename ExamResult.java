package Excercise.classes;

public class ExamResult {

	public static void main(String[] args) {
		
		int A=57, B=40;
		if(A>=55 && B>=45) {
			System.out.println("He is Passed");
		}
		else if((A>=45 && A<55) && B>=55) {
			System.out.println("He is Passed");
		}
		else if(B<45 && A>=65) {
			System.out.println("He is allowed to reapper in examination of B");
		}
		else {
			System.out.println("He is Failed");
		}

	}

}
