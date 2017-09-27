package ru.mail.urbanovichalexandr.ProgectForInstinctools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {

		String pronouns = "pronouns.txt";
		
// запрашиваем у пользователя путь к файлу, читаем его и передаем функии для чтения файла
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter file name.");
		String fileName =  scanner.nextLine();
//scanner.close();
		String contents = ReadFile.readUsingBufferedReader(fileName);
		String contentsPronouns = ReadFile.readUsingBufferedReader(pronouns);
		
//		преобразуем текст и исключаемые слова в коллекцию ArrayList
		List<String> list1 = new ArrayList<>(new ReadFile(fileName, "\\W+"));
		
		List<String> list2 = new ArrayList<>(new ReadFile(pronouns, "\\W+"));
		
//исключаем все местоимения и предлоги
		list1.removeAll(list2);
		
		contents = CountWord.count(list1);
		
		System.out.println("Enter file name.");
		String fileName1 =  scanner.nextLine();
		String brackets = ReadFile.readUsingBufferedReader(fileName1);
		Boolean boll = Brackets.parsing(brackets);
		
		if((boll == true)) {
			System.out.println("correct");
		}else {
			System.out.println("incorrect");
		}
	}
}


