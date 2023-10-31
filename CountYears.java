package Excercise.classes;

public class CountYears {

	public static void main(String[] args) {
		int inputDays=1065;
		int years=inputDays/365;
		int months=(inputDays-(years*365))/30;
		int days=inputDays-((months*30)+(years*365));
		System.out.println(years);
		System.out.println(months);
		System.out.println(days);

	}

}
