package Excercise.classes;

public class AreaOfRectangle {

	public static void main(String[] args) {
		int length=3, breadth=6;
		int area=length*breadth;
		int perimeter=2*(length+breadth);
		if(area>perimeter) {
			System.out.println("Area is greter than Perimeter");
		}
		else if(area==perimeter) {
			System.out.println("Area is equal to Perimeter");
		}
		else {
			System.out.println("Perimeter is greter than Area");
		}
	}

}
