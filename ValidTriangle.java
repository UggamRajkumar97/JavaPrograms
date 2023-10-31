package Excercise.classes;

public class ValidTriangle {

	public static void main(String[] args) {
		int angle1=30;
		int angle2=60;
		int angle3=100;
		int angle=angle1+angle2+angle3;
		if(angle==180) {
			System.out.println("This is a valid Triangle");
		}
		else {
			System.out.println("This is not a valid Triangle");
		}

	}

}
