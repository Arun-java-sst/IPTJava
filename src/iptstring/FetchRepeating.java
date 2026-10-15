package iptstring;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FetchRepeating {


public static void main(String[] args) {
	
	//String  - get  repeating characters
	String s = "smart skills technologies";
	Map<Character,Integer> m = new LinkedHashMap<>();
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if(m.containsKey(ch)) {
			Integer count = m.get(ch);
			m.put(ch, count+1);
		}
		else {
			m.put(ch,  1);
		}
}
	Set<Entry<Character,Integer>> set = m.entrySet();
	for (Entry<Character, Integer> entry : set) {
		if (entry.getValue()>1) {
			System.out.println(entry);
			
		}
	}
}
}
