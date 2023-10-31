package Excercise.classes;

public class Pattern {

	public static void main(String[] args) {
		for(int i=65;i<=70;i++) {
			for(int j=70;j>=65;j--) {
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print((char)j);
				}
			}
			System.out.println();
			
		}
	}
	public static void main2(String[] args) {
		for(int i=15;i>=11;i--) {
			for(int j=11;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}
	public static void main1(String[] args) {
		int number=5;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
