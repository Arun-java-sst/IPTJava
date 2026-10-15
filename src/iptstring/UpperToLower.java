package iptstring;

public class UpperToLower {
public static void main(String[] args) {
	//upper to lower 
	//lower to upper
	String s = "Smart Skills Technolgies";
	String res ="";

	for (int i = 0; i < s.length(); i++) {
		char ch =s.charAt(i);
		
		if(Character.isUpperCase(ch)) {
		res=res+Character.toLowerCase(ch);
		}
		else if(Character.isLowerCase(ch)) {
			res=res+Character.toUpperCase(ch);
		} 
		else {
			res=res+ch;
		}
		
}
	System.out.println(res);
}
}
