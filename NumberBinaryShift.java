package classes.practice;


	/*
	 * 
	 * Given an unsigned integer, swap all odd bits with even bits. For example,
	 *  if the given number is 23 (00010111),
	 it should be converted to 43 (00101011). Every even position bit is swapped with the adjacent
	  bit on the right side
	 (even position bits are highlighted in the binary representation of 23),
	  and every odd position bit is swapped with an
	 adjacent on the left side.

	 */

	public class NumberBinaryShift {
		public static void main(String[] args) {
		
			
			int n =23,r;
			int[] bn = new int[8];
			int index=7;
			while( n != 0) {
			
				 r = n % 2;
				 n= n / 2;
				 bn[index--] = r;
			}
			for(int i=0;i<8;i++) {
				System.out.print(bn[i]);
			}
			int b=0;
			String res = "";
			// 00010111
			for(int i=0;i<8;i++) {
				if(i % 2 == 0) {
					res = res + bn[i+1];
				}
				else {
					res = res + bn[i-1];
				}
			}// for
			System.out.println("\n result ---->"+res);
			
		}

}
