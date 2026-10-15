package iptstring;

public class VowelsCount {
public static void main(String[] args) {
	// To Find the Vowels Count of Given String
	String s = "Smart@Skills #Technoligies123";
	int vowelsCount=0;
	String vowels ="";
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			vowelsCount++;
			vowels=vowels+ch;
		}
	}
	System.out.println("vowels Characters :"+vowels);
	System.out.println("vowelsCount :"+vowelsCount);
}
}
