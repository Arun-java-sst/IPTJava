package iptstring;

import java.util.*;

public class Occuranceofchar {
public static void main(String[] args) {
	//String Occurance - count of each characters
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
	System.out.println(m);
}
}
