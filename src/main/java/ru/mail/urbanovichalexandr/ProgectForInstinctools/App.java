package ru.mail.urbanovichalexandr.ProgectForInstinctools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter file name.");
		String fileName =  scanner.nextLine();
		System.out.println(fileName);
//		scanner.close();
		String contents = readUsingBufferedReader(fileName);
		System.out.println(contents);
	}
		
	private static String readUsingBufferedReader(String fileName) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");
		while((line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
		}
		stringBuilder.deleteCharAt(stringBuilder.length()-1);
		return stringBuilder.toString();
	}
	
}


