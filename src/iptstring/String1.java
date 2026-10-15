package iptstring;

public class String1 {
public static void main(String[] args) {
	String s = "aaabbc";
	for(int i=0; i<s.length(); i++) {
		char ch = s.charAt(i);
		int count=1;
		while(i+1 < s.length() && s.charAt(i)==s.charAt(i+1)) {
			count++;
			i++;
		}
		System.out.print(ch+""+count);
	}
}
}


 








