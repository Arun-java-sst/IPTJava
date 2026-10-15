package iptprogram;

public class StringBuffer18 {
//	Create a separate word in 2 string , join two of them

	static StringBuffer s1 = new StringBuffer("Hello");
	static StringBuffer s2 = new StringBuffer("World");
	
public static void main(String[] args) {
	
	s1.append(s2);
	
	System.out.println(s1);
}
}
