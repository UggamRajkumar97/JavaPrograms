package Excercise.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileCountWords {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName=sc.next();
		File file=new File(fileName);
		FileReader fr;
		BufferedReader br;
		String [] sArr;
		if(file.exists()) {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			String data=br.readLine();
			sArr=data.split(" ");
			System.out.println("Number of words in the file is "+sArr.length);
		}
		else {
			System.out.println(file+" :: This File not found");
		}
	}
}
