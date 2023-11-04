package classes.practice;

public class RemoveDuplicatFromArr2 {

	
	public static void main(String[] args) {
	
	int[] n = {10,20,20,30,20,10,40,50,10,30};
	
	System.out.println("Before Removing Duplicates.....");
	for(int i=0;i<n.length;i++) {
		System.out.print(n[i]+" ");
	}

	int size = n.length;
		for(int i=0;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
				
				if(n[i] == n[j]) {
					for(int k=j;k<size-1;k++) {
						n[k] = n[k+1];
					}// k
					size = size-1;
					j--;
				}// if
			}// j
		}// i
		System.out.println("\n After Removing Duplicates.....");
		for(int i=0;i<size;i++) {
			System.out.print(n[i]+" ");
		}
	
	}

}