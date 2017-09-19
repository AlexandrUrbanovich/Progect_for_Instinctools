package ru.mail.urbanovichalexandr.ProgectForInstinctools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter file name.");
		String fileName =  scanner.nextLine();
		System.out.println(fileName);
//		scanner.close();
		String contents = ReadFile.readUsingBufferedReader(fileName);
		System.out.println(contents);
	
	
		String [] words = ReadFile.readUsingBufferedReader(fileName).toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
		
		Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }
 
        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
		
	}
}
}


