package Excercise.classes;

public class Fahrenhet {

	public static void main(String[] args) {
		double fahrenhet=50;
		double celsius=(fahrenhet-32)*5/9;
		int div=(int) celsius;
		if((celsius-div)>=0.6 && (celsius-div)<=0.9) {
			System.out.println(div+1);
		}
		else {
			System.out.println(div);
		}
		

	}

}
