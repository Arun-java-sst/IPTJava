package iptstring;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class OccuranceOfEachWord {

	public static void main(String[] args) {
		
		//String  - occurance of each word
		String s = "smart skills technologies";
		Map<String,Integer> m = new LinkedHashMap<>();
		String[] words = s.split(" ");
		for (String word : words) {
			if(m.containsKey(word)) {
				Integer count = m.get(word);
				m.put(word, count+1);
			}
			else {
				m.put(word,  1);
			}
	}
		Set<Entry<String,Integer>> set = m.entrySet();
		for (Entry<String, Integer> entry : set) {
				System.out.println(entry);
				
			}
		}
	}
	
