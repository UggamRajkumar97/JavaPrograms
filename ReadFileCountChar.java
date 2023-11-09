package Excercise.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFileCountChar {

	public static void main(String[] args) throws IOException {

		/*
		 * Scanner input = new Scanner(new File("src/source.txt")); int in=
		 * input.nextInt(); System.out.println(in);
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		String str = sc.next();
		System.out.println("Enter the File name");
		String iFile = sc.next();
		
		
		char ch = str.charAt(0);
		FileReader fr;
		int count = 0;
		char[] cArr = new char[100];
		File file = new File(iFile);
		
		if (file.exists()) {
			fr = new FileReader(file);
			fr.read(cArr);
			for (char fch : cArr) {
				if (fch == ch) {
					count++;
				}
			}
			System.out.println("Character " + ch + " is found " + count + "times in the file");
		}
		else {
			System.out.println("File is found ");

		}

	}
}
