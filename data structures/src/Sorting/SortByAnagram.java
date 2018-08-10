package Sorting;

import java.util.*;
import java.util.Map.Entry;

public class SortByAnagram {
	
	public static void anagramSort(String [] words) {
		
		HashMap<String, List<String>> anagramMap = new HashMap<>();
		for(String word: words) {
			String key = sortStringByChar(word);
			if(anagramMap.containsKey(key)) {
				anagramMap.get(key).add(word);
			}else {
				ArrayList<String> value = new ArrayList<>();
				value.add(word);
				anagramMap.put(key, value);
			}
		}
		//String[] res = new String[];
		int i=0;
		for(Entry<String, List<String>> e: anagramMap.entrySet()) {
			
			System.out.println("key " + e.getKey() + " value "+ e.getValue());
			List<String> tempRes = e.getValue();
			
			for(String word:tempRes) {
				words[i] = word;
				i++;
			}
		}
			
	}
	
	private static String sortStringByChar(String ip) {
		
		char [] temp = ip.toCharArray();
		Arrays.sort(temp);
		
		return new String(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ip = new String[]{"dog", "god", "pit", "tip", "hello", "odg"};
		//String[] ip = new String[]{"dog", "god", "pit", "odg", "tip"};
		System.out.println("before");
		for(String word: ip) {
			System.out.println(word);
		}
		
		anagramSort(ip);
		System.out.println("after");
		for(String word: ip) {
			System.out.println(word);
		}
		

	}

}
