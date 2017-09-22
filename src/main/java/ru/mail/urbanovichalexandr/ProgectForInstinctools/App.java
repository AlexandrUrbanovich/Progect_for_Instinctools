package ru.mail.urbanovichalexandr.ProgectForInstinctools;

import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {

		String pronouns = "pronouns.txt";
		
// запрашиваем у пользователя путь к файлу, читаем его и передаем функии для чтения файла
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter file name.");
		String fileName =  scanner.nextLine();
		System.out.println(fileName);
//scanner.close();
		String contents = ReadFile.readUsingBufferedReader(fileName);
		String contentsPronouns = ReadFile.readUsingBufferedReader(pronouns);
		System.out.println(contents);
		System.out.println(contentsPronouns);
	
//удаляем из текста все возможные символы кроме слов	
		String [] words = ReadFile.readUsingBufferedReader(fileName).toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

		
//вызываем метод подсчета частоты встречаемости слова
		contents = CountWord.count(words);
		
	}
}


