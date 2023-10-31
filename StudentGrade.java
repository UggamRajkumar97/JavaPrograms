package Excercise.classes;

public class StudentGrade {

	public static void main(String[] args) {
		int marks = 88;
		char grade = (marks >= 90 && marks <= 100) ? 'A'
				: (marks >= 75 && marks <= 89) ? 'B' : (marks >= 60 && marks <= 74) ? 'C' : 'F';
		System.out.println(grade);

	}

}
