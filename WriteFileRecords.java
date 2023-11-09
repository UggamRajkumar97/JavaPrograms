package Excercise.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFileRecords {

	public static void main(String[] args) throws IOException {
		String yn = "n";
		FileWriter fw=new FileWriter("src/storage.txt");
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name of Person");
			String name=sc.next();
			System.out.println("Enter PhoneNUmber of Person");
			int phone=sc.nextInt();
			System.out.println("Enter Account of Person");
			int account=sc.nextInt();
			
			fw.write(name);
			fw.write(phone);
			fw.write(account);
			fw.flush();
			System.out.println("If you want to Enter one more Person Y/N");
			yn=sc.next();
		
		}while(yn.equalsIgnoreCase("Y"));
		
		fw.close();
		
		
	}

}
