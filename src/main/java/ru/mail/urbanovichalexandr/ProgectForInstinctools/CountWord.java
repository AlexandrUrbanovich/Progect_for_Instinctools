package ru.mail.urbanovichalexandr.ProgectForInstinctools;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
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


//counterMap.entrySet().stream().sorted((Entry.<String, Integer>comparingByValue()).reversed()).forEach(System.out::println);
	
//сортируем коллекцию по количеству повторений слов в тексте		
		Map<String, Integer> sortedMap = sortByValue(counterMap);
		printMap(sortedMap);
		
		return null;
	}
	
	private static Map<String, Integer> sortByValue(Map<String, Integer> counterMap){
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(counterMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	public static <K, V> void printMap(Map<K, V> map) {
		int i = 0;
		for(Map.Entry<K, V> entry : map.entrySet()) {
			if(i < 10) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
				i++;
			}
		}
	}

}

