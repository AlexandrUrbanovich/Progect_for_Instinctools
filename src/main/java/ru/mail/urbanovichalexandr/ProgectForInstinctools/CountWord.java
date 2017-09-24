package ru.mail.urbanovichalexandr.ProgectForInstinctools;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWord {

	//заносим каждое слово в коллекцию HashMap, а в значении считаем количество повторений в тексте
	public static String count(List<String> words) {

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

//сортируем коллекцию по количеству повторений слов в тексте
		counterMap.entrySet().stream().sorted((Map.Entry.<String, Integer>comparingByValue()).reversed()).forEach(System.out::println);

		return null;
	}
}
