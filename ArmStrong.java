package exam.assignments;

public class ArmStrong {

	public static boolean isArmstrong(int num) {
		int newNum=num;
		int remainder,sum=0;
		while(num!=0) {
			remainder=num%10;
			num=num/10;
			sum=sum+remainder*remainder*remainder;
		}
		if(sum==newNum) return true;
		else return false;
	}
	public static void main(String[] args) {
		boolean	num;
		for(int i=1;i<=1000;i++) {
		num=ArmStrong.isArmstrong(i);
			if(num) {
				System.out.println("It is Armstrong--> "+i);
			}
		}

	}

}
