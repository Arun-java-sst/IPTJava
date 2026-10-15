package iptstring;

public class SecondHighestString {
public static void main(String[] args) {
	String s = "Hello java programming";
	String[] words = s.split(" ");
	String largest = "";
	String seclargest = "";
	for (int i = 0; i < words.length; i++) {
		if(words[i].length()>largest.length()) {
			seclargest =largest;
			largest=words[i];
		} else if (words[i].length() > seclargest.length()) {
			seclargest=words[i];
		}
	}
	System.out.println(seclargest);
}
}
