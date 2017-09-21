package ru.mail.urbanovichalexandr.ProgectForInstinctools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {

		
// запрашиваем у пользователя путь к файлу, читаем его и передаем функии для чтения файла
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter file name.");
		String fileName =  scanner.nextLine();
		System.out.println(fileName);
//		scanner.close();
		String contents = ReadFile.readUsingBufferedReader(fileName);
		System.out.println(contents);
	
//удаляем из текста все возможные символы кроме слов	
		String [] words = ReadFile.readUsingBufferedReader(fileName).toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

		
//вызываем метод подсчета частоты встречаемости слова
		contents = CountWord.count(words);
		
	}
}


